import numpy as np
# -*- coding: utf-8 -*-
from py_expression_eval import Parser


class EGaussSimple:
    __gui = None
    mensaje = ""
    data = []

    def __init__(self, gui):
        self.__gui = gui

    def matrixAum(A, b ,n):
        for i in range(n):
            Ab = A[i].append(b[i])
        return Ab


    def eliminacionGaussianaSimple(self, A, b, n):
        Ab = matrixAum(A,b)
        U = np.zeros((n,n+1))
        for k in range(1, n-1):
            for i in range(k+1,n):
                multiplicador = (Ab[i][k] / Ab[k][k])
                for j in range(k, n+1):
                    U = Ab[i][j] = Ab[i][j] - (multiplicador * Ab[k][j])
        y = b.size()
        x = np.zeros((n,1))
        x[y] = (U[y, y+1] / U[n][n])
        for i in range(n-1,-1,-1):
            sumatoria = 0
            for p in range (i+1, n):
                sumatoria = sumatoria + (Ab[i][p] * x[p])
                x[i] = (Ab[i][n+1] - sumatoria) / Ab[i][i]
        return x
