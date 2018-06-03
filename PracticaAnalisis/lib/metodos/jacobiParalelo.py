import numpy as np
import sys
import json
from math import *
import threading

def matrixAum(A, b, tam):
    aTemp = A.tolist()
    for i in range(tam):
        filaTemp = aTemp[i]
        filaTemp.append(b[i])
        aTemp[i] = np.array(filaTemp)
    Ab = np.array(aTemp)
    return Ab


def interpretarMatriz(tam, b, a):
    matrizB = np.zeros(tam)
    matrizA = []
    b = b[1:-1]
    matrizB = np.fromstring(b, dtype=float, sep=",")
    a = a[1:-1]
    temp = a.split(":")
    for i in range(tam):
        fila = temp[i]
        fila = fila[1:-1]
        mtemp = np.fromstring(fila, dtype=float, sep=",")
        matrizA.append(mtemp)
    matrizA = np.array(matrizA)
    return matrizB, matrizA

def jacobiParalelo(size, xValues, A, i, xNewValues, r):
    print("CICLO I")
    suma = 0
    aii = 0
    for j in range(size):
        print("CICLO J")
        var = A[i][j]
        if (i != j):
            suma += var * xValues[j]
        else:
            aii = var
        print("Suma = ", suma)

    print("Aii = ", aii)
    var = A[i][size]
    xNewValues[i] = (var - suma) / aii
    xNewValues[i] = r * xNewValues[i] + (1 - r) * xValues[i]

def newJacobi(xValues, xNewValues, A, size, r, norma):
    nInfAbs = 0
    nEucAbs = 0
    nInfRel = 0
    nInfRelD = 0
    nEucRel = 0
    nEucRelD = 0
    disp = 0
    for i in range(size):
        t = threading.Thread(target=jacobiParalelo, args=(size, xValues, A, i, xNewValues, r))
        t.start()
        t.join()
        nInfAbs = max(nInfAbs, abs(xNewValues[i] - xValues[i]))
        nInfRelD = max(nInfRelD, abs(xNewValues[i]))
        nEucAbs = nEucAbs + (xNewValues[i] - xValues[i]) ** 2
        nEucRelD = nEucRelD + (xNewValues[i]) ** 2
        print("VAR = ", var)
        print(xNewValues)

    nInfRel = nInfAbs / nInfRelD
    nEucRel = sqrt(nEucAbs) / sqrt(nEucRelD)

    if int(norma) == 0:
        disp = nInfAbs
    elif int(norma) == 1:
        disp = nInfRel
    elif int(norma) == 2:
        disp = sqrt(nEucAbs)
    elif int(norma) == 3:
        disp = nEucRel

    return disp, xNewValues


def jacobi(xValues, xNewValues, A, size, tol, niter, r, norma):
    disp = tol + 1
    cont = 0
    print(cont)
    print(xValues)
    print(0)
    print("!")
    while (disp > tol and cont < niter):

        print("ITERACICON JACOBI")
        print("PARAMETROS")
        print(xValues, xNewValues, A, size, r, norma)

        disp, xNewValues = newJacobi(xValues, xNewValues, A, size, r, norma)
        print("-----")
        print(disp)
        print(xNewValues)
        print("-----")
        for i in range(size):
            xValues[i] = xNewValues[i]

        print("SALIDA JACOBI")
        cont += 1
        print(cont)
        print(xNewValues)
        print(disp)
        print("!")

    if (disp <= tol):
        bandera = True
    else:
        bandera = False
    return bandera, xValues, xNewValues, A, tol, niter, disp


def main():
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]
    tolerance = float(sys.argv[4])
    maxIterations = float(sys.argv[5])
    norma = sys.argv[6]
    relajacion = float(sys.argv[7])
    xValues = json.loads(sys.argv[8])

    xNewValues = np.zeros(tam)
    matrizB, matrizA = interpretarMatriz(tam, b, a)
    Ab = matrixAum(matrizA, matrizB, tam)
    success, xValues, xNewValues, A, tol, niter, error = jacobi(xValues, xNewValues, Ab, tam, tolerance, maxIterations,
                                                                relajacion, norma)
    # print success,xValues,xNewValues,A,tol,niter
    if (success):
        for i, x in enumerate(xValues):
            print("x{0} = {1}  ".format(i + 1, x))

    else:

        print("No se pudo alcanzar una solucion en %d iteraciones") % maxIterations


main()
