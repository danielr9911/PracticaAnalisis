import threading

import numpy as np
import sys
from math import *


def interpretarMatriz(tam, b, a):
    L = np.zeros((tam, tam))
    U = np.zeros((tam, tam))
    Z = np.zeros(tam)
    X = np.zeros(tam)
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
    return L, U, matrizA, matrizB, Z, X


def readMatrix(file, size):
    L = np.zeros((size, size))
    U = np.zeros((size, size))
    A = np.zeros((size, size))
    B = np.zeros(size)
    Z = np.zeros(size)
    X = np.zeros(size)
    for i in range(size):
        cont = 0
        fileMio = file.readline().replace("\n", "").split(" ")
        linea = fileMio[0:size]
        for j in linea:
            A[i][cont] = float(j)
            cont += 1
        valorB = fileMio[len(fileMio) - 1]
        B[i] = float(valorB)

    return L, U, A, B, Z, X

def calcularLParalelo(k,L,A,i,U):
    suma2 = 0
    for p in range(0, k):
        suma2 += L[i][p] * U[p][k]
    L[i][k] = (A[i][k] - suma2) / float(U[k][k])

def calcularUParalelo(k,L,A,j,U):
    suma3 = 0
    for h in range(k):
        suma3 += L[k][h] * U[h][j]
    U[k][j] = (A[k][j] - suma3) / float(L[k][k])

def doolittle(L, U, A, n):
    for k in range(n):
        print("+ ETAPA: %d \n" % k)
        print("Matriz L")
        print(np.array(L))
        print("Matrix U")
        print(np.array(U))

        suma1 = 0
        for m in range(k):
            suma1 += L[k][m] * U[m][k]
        L[k][k] = 1
        U[k][k] = A[k][k] - suma1

        if float(U[k][k]) == 0.0 or float(L[k][k]) == 0.0:
            print("##################################")
            print("El sistema no tiene solucion unica")
            print("##################################")
            return L, U, False

        for i in range(k, n):
            t = threading.Thread(target=calcularLParalelo, args=(k,L,A,i,U))
            t.start()
            t.join()

        for j in range(k + 1, n):
            t = threading.Thread(target=calcularUParalelo, args=(k,L,A,j,U))
            t.start()
            t.join()

    return L, U, True


def progressive(Z, B, L, n):
    for i in range(n):
        sum = 0.0
        for p in range(i):
            sum += L[i][p] * Z[p]
        Z[i] = (B[i] - sum) / L[i][i]
    return Z


def regressiveC(X, Z, U, n):
    for i in range(n - 1, -1, -1):
        sum = 0.0
        for p in range(i + 1, n):
            sum += U[i][p] * X[p]
        X[i] = (Z[i] - sum) / U[i][i]
    return X


def main():
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]
    L, U, A, B, Z, X = interpretarMatriz(tam, b, a)

    L, U, exito = doolittle(L, U, A, tam)
    if exito:
        Z = progressive(Z, B, L, tam)
        X = regressiveC(X, Z, U, tam)
        print("!")
        print(L)
        print("!")
        print(U)
        print("!")
        for i, x in enumerate(X):
            print("x{0} = {1}  ".format(i + 1, x))
        print("\n")
        for i, x in enumerate(Z):
            print("z{0} = {1}  ".format(i + 1, x))
    else:
        print("!")
        cero = np.zeros((tam, tam + 1))
        print(cero)
        print("!")
        print(cero)
        print("!")
        print("El sistema no tiene solucion unica")


main()