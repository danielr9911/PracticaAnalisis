import numpy as np
# -*- coding: utf-8 -*-
from py_expression_eval import Parser


class Doolittle:
    __gui = None
    mensaje = ""
    data = []

    def __init__(self, gui):
        self.__gui = gui

    def matrixAum(A, b ,n):
        for i in range(n):
            Ab = A[i].append(b[i])
        return Ab

    def doolittle(self, A, b, n):
        Ab =  matrixAum(A, b, n)
        L = np.zeros((n,n))
        U = np.zeros((n,n))
        for k in range (1,n):
            suma = 0
            for m in range(1,k-1):
                suma = suma + (L[k][m] * U[m][k])
            U[k][k] = Ab[k][k] - suma
            L[k][k] = 1
            for i in range(k+1,n):
                suma1 = 0
                for p in range(0,k-1):
                    suma1 = suma + (L[i][p] * U[p][k])
                if U[k][k] != 0:
                    L[i][k] = (Ab[i][k] - suma1) / U[k][k]
                else:
                    print "Division por 0"
            for j in range(k+1, n):
                suma2 = 0
                for h in range(1,k-1):
                    suma2 = suma2 + (L[k][h] * U[h][j])
                U[k][j] = Ab[k][j] - suma2
        detU = np.linalg.det(U)
        detL = np.linalg.det(L)
        det = detL * detU
        if det == 0:
            print "El sistema tiene varias o no tiene solucion"
        else:
            #z = sustitucionProgresiva(L,b)
            z = np.zeros(n)
            for i in range(n):
                sum = 0
                for p in range(i):
                    sum = sum + L[i][p] * z[p]
                z[i] = (b[i] - sum) / L[i][i]

            #x = sustitucionRegresiva(U,z)
            x = np.zeros(n)
            for i in range(n-1,-1,-1):
                sum = 0
                for p in range(i+1,n):
                    sum = sum + U[i][p] * x[p]
                    x[i] = (z[i] - sum) / U[i][i]
            return x

