# -*- coding: utf-8 -*-
import numpy as np
from py_expression_eval import Parser

class PivoteoTotal:
    __gui = None
    matrizFinal = []
    resultX = ""
    matrizEtapas = []

    def __init__(self, gui):
        self.__gui = gui

    def matrixAum(self,A,b,n):
        #Pegarle a la matriz A la matriz B para ahorrar procesamiento
        for i in range(n):
            A[i].append(b[i])
        return A


    def pivoteo_total(self,Ab,k,marcas,n):
        #inicializar marcas
        mayor = 0
        fila_mayor = k
        columna_mayor = k
        for r in range(k,n):
            for s in range(k,n):
                if abs(Ab[r][s]) > mayor:
                    mayor = abs(Ab[r][s])
                    fila_mayor = r
                    columna_mayor = s
        if mayor == 0:
            return "El sistema tiene infinitas soluciones"
        else:
            if fila_mayor != k:
                aux= np.array(Ab[fila_mayor])
                Ab[fila_mayor]=Ab[k]
                Ab[k]=aux
            if columna_mayor != k:
                for row in Ab:
                    row[k],row[columna_mayor] = row[columna_mayor],row[k]
                marcas[k],marcas[columna_mayor] = marcas[columna_mayor],marcas[k]
        return Ab,marcas

    def eliminacion_gaussiana_pivoteo(self,Ab,n):
        marcas = np.arange(n)
        print "Matrix  \n",np.array(Ab)
        for k in range(0,n-1):
            print "Iter ",k, "\n"
            Ab,marcas = pivoteo_total(Ab,k,marcas,n)
            print "\n","Marcas ",marcas
            for i in range(k+1,n):
                multiplicador = Ab[i][k]/float(Ab[k][k])
                print "Multiplier : ",i," ",multiplicador,"\n"
                for j in range(k,n+1):
                    Ab[i][j] = Ab[i][j] - multiplicador * Ab[k][j]

            print "\n","Matrix  \n",np.array(Ab),"\n"

        return Ab,marcas


    def sustitucion_regresiva(self,Ab,n):
        x= np.zeros(n)
        for i in range(n-1,-1,-1):
            sumatoria = 0.0
            for p in range(i+1,n):
                sumatoria += Ab[i][p]*x[p]
            x[i] = (Ab[i][n]-sumatoria)/float(Ab[i][i])
        return x