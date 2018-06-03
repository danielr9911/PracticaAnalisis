import numpy as np
import sys
from math import *

def calcularInversa(L,U, tam):
    matrizInversa = np.zeros((tam,tam))
    Z = np.zeros(tam)
    X = np.zeros(tam)
    columna = np.zeros(tam)
    for i in range(tam):
        columna = hallarColumnaInversa(i,tam)
        Z = sustitucionProgresiva(Z, columna, L, tam)
        X = sustitucionRegresiva(X, Z, U, tam)
        for j in range(tam):
            matrizInversa[j][i] = X[j]
    return matrizInversa

def hallarColumnaInversa(indice, n):
    col = np.zeros(n)
    col[indice] = 1
    return col


def sustitucionProgresiva(Z, B, L, n):
    for i in range(n):
        sum = 0.0
        for p in range(i):
            sum += L[i][p] * Z[p]
        Z[i] = (B[i] - sum) / L[i][i]
    return Z

def imprimirMatriz(matriz, tam):
    linea = ""
    for i in range(tam):
        for j in range(tam):
            if(j != len(matriz)-1):
                linea += str(matriz[i][j]) + ";"
            else:
                linea+= str(matriz[i][j])
        if(i != len(matriz)-1):
            linea+=":"
    print(linea)

def sustitucionRegresiva(X, Z, U, n):
    for i in range(n - 1, -1, -1):
        sum = 0.0
        for p in range(i + 1, n):
            sum += U[i][p] * X[p]
        X[i] = (Z[i] - sum) / U[i][i]
    return X

def interpretarMatriz(tam,l,u):
    matrizL = np.zeros((tam,tam))
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

def main():
    tam = int(sys.argv[1])
    sl = sys.argv[2]
    su = sys.argv[3]

    inv = calcularInversa(L, U, tam)
    imprimirMatriz(inv, tam)


main()
