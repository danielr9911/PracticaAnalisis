import numpy as np
import sys
import json
from math import *



def matrixAum(A,b,tam):
    aTemp = A.tolist()
    for i in range(tam):
        filaTemp = aTemp[i]
        filaTemp.append(b[i])
        aTemp[i] = np.array(filaTemp)
    Ab = np.array(aTemp)
    return Ab

def interpretarMatriz(tam,b,a):
    matrizB = np.zeros(tam)
    matrizA = []
    b = b[1:-1]
    matrizB = np.fromstring(b,dtype=float,sep=",")
    a = a[1:-1]
    temp = a.split(":")
    for i in range(tam):
        fila = temp[i]
        fila = fila[1:-1]
        mtemp = np.fromstring(fila,dtype=float,sep=",")
        matrizA.append(mtemp)
    matrizA = np.array(matrizA)
    return matrizB, matrizA

def sIteration(xValues,A,size,r, norma):
    nInfAbs = 0
    nEucAbs = 0
    nInfRel = 0
    nInfRelD = 0
    nEucRel = 0
    nEucRelD = 0
    disp = 0

    for i in range (size):
        suma = 0
        for j in range (size):
            var = A[i][j]
            if (i!=j):
                suma += var*xValues[j]
            else:
                aii = var

        var = A[i][size]
        xNewValues = (var - suma)/aii
        xNewValues= r*xNewValues+(1-r)*xValues[i]

        nInfAbs = max(nInfAbs, abs(xNewValues- xValues[i]))
        nInfRelD = max(nInfRelD, abs(xNewValues))
        nEucAbs = nEucAbs + (xNewValues- xValues[i]) ** 2
        nEucRelD = nEucRelD + (xNewValues) ** 2
        xValues[i]=xNewValues


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
    
    return disp,xValues

def gaussS(xValues,A,size,tol,niter,r, norma):
    disp = tol+1
    cont = 0
    print(cont)
    print(xValues)
    print(0)
    print("!")
    while (disp > tol and cont < niter):
        
        disp,xNewValues = sIteration(xValues,A,size,r,norma)
        
        cont+=1
        print(cont)
        print(xNewValues)
        print(disp)
        print("!")

    if (disp <= tol):
        bandera= True
    else:
        bandera=False
    return bandera,xNewValues,A,tol,niter,disp

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

    success,xNewValues,A,tol,niter,error = gaussS(xValues,Ab,tam, tolerance, maxIterations,relajacion,norma)
    #print success,xValues,xNewValues,A,tol,niter
    if (success):
        for i, x in enumerate(xValues):
            print("x{0} = {1}  ".format(i + 1, x))

    else:
        print("No se pudo alcanzar una solucion en %d iteraciones") %maxIterations

main()
