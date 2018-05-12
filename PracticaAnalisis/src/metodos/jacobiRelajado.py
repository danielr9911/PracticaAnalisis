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

def newJacobi(xValues,xNewValues,A,size,r):
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
        xNewValues[i] = (var - suma)/aii
        xNewValues[i]= r*xNewValues[i]+(1-r)*xValues[i]
        disp = max(disp, abs(xNewValues[i]- xValues[i]))

    return disp,xNewValues

def jacobi(xValues,xNewValues,A,size,tol,niter,r):
    disp = tol+1
    cont = 0
    while (disp > tol and cont < niter):
        for i in range (size):
            xValues[i] = xNewValues[i]
        disp,xNewValues = newJacobi(xValues,xNewValues,A,size,r)
        print("+ ETAPA %d \n") % cont
        cont+=1

        print("Vector x :",np.array(xNewValues))
        print ("\n")
        print("Error: ",disp)
        print ("\n")

    if (disp <= tol):
        bandera= True
    else:
        bandera=False
    return bandera,xValues,xNewValues,A,tol,niter,disp

def main():
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]
    tolerance = float(sys.argv[4])
    maxIterations=float(sys.argv[5])
    relajacion= float(sys.argv[6])
    xValues = json.loads(sys.argv[7])

    xNewValues = np.zeros(tam)
    matrizB, matrizA = interpretarMatriz(tam, b, a)

    success,xValues,xNewValues,A,tol,niter,error = jacobi(xValues,xNewValues,matrizA,tam, tolerance, maxIterations,relajacion)
    #print success,xValues,xNewValues,A,tol,niter
    if (success):
        print ("Matrix A")
        print (np.array(A))
        print ("\n")
        print(np.array(xValues))
        print ("\n")
        print("Error: ",error)
        print ("\n")

    else:
        print("could not reach the solutions in ", maxIterations , " iterations")

main()
