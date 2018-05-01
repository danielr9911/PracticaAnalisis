# -*- coding: utf-8 -*-
from py_expression_eval import Parser
import numpy as np

class PivoteoParcial:
    __gui = None
    matrizFinal = []
    resultX = ""
    matrizEtapas = []

    def __init__(self, gui):
        self.__gui = gui

    def matrixAum(self, A, b, n):
        for i in range(n):
            A[i].append(b[i])
        return A

    def intercambieFilas(self, Ab, fila_mayor, k):
        Ab[k], Ab[fila_mayor] = Ab[fila_mayor], Ab[k]
        return Ab

    def pivoteo_parcial(self, Ab, k, n):
        mayor = abs(Ab[k][k])
        fila_mayor = k
        for s in range(k + 1, n):
            if (abs(Ab[s][k]) > mayor):
                mayor = abs(Ab[s][k])
                fila_mayor = s
        if mayor == 0:
            return "El sistema no tiene solucion unica"
        else:
            if fila_mayor != k:
                Ab = self.intercambieFilas(Ab, fila_mayor, k)
            return Ab

        Ab[k], Ab[fila_mayor] = Ab[fila_mayor], Ab[k]
        return Ab

    def eliminacion_gaussiana_pivoteo(self, Ab, n):
        # n = len(A)
        marcas = np.arange(n)
        # Ab = matrixAum(A,b,n)
        etapa = []
        for k in range(0, n - 1):
            print("Iter ", k, "\n")
            Ab = self.pivoteo_parcial(Ab, k, n)
            multiplicadores = []
            for i in range(k + 1, n):
                multiplicador = Ab[i][k] / float(Ab[k][k])
                multiplicadores.append("Multiplicador %d = %f" %(i,multiplicador))
                print("Multiplicador %d = %f" %(i,multiplicador))
                for j in range(k, n + 1):
                    Ab[i][j] = Ab[i][j] - multiplicador * Ab[k][j]

            print("\n", "Matrix  \n", np.array(Ab), "\n")
            etapa.append(multiplicadores)
            etapa.append(np.array(Ab))
        self.matrizEtapas.append(etapa)
        return Ab

    def sustitucion_regresiva(self, Ab, n):
        x = np.zeros(n)
        for i in range(n - 1, -1, -1):
            sumatoria = 0.0
            for p in range(i + 1, n):
                sumatoria += Ab[i][p] * x[p]
            x[i] = (Ab[i][n] - sumatoria) / float(Ab[i][i])
        return x

    def metodoPivoteoParcial(self, tam, A, b):
        Ab = self.matrixAum(A, b, tam)
        self.matrixFinal = self.eliminacion_gaussiana_pivoteo(Ab, tam)
        print("\n", "The final matrix is:\n ", self.matrixFinal, "\n")
        x = self.sustitucion_regresiva(self.matrixFinal, tam)
        for i, x in enumerate(x):
            self.resultX = self.resultX + "x{0} = {1}  ".format(i + 1, x) + "\n"
            #print("x{0} = {1}  ".format(i + 1, x))
        print(self.resultX)
        return self.matrixFinal, self.resultX, self.matrizEtapas
