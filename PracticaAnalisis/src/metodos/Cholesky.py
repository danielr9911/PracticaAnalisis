# -*- coding: utf-8 -*-
import numpy as np
from py_expression_eval import Parser
from math import *


class Cholesky:
    __gui = None
    mensaje = ""
    data = []

    def cholesky (self,L,U,A,n):
        L = np.zeros((size, size))
        U = np.zeros((size, size))
        Z = np.zeros(size)
        X = np.zeros(size) 
        for k in range(n):
            suma1=0
            for m in range (k):
                suma1+=L[k][m]*U[m][k]
            L[k][k]=sqrt(A[k][k]-suma1)
            U[k][k]=L[k][k]

            for i in range (k,n):
                suma2=0
                for p in range (0,k):
                    suma2+=L[i][p]*U[p][k]
                L[i][k]=(A[i][k]-suma2)/float(U[k][k])

            for j in range (k+1,n):
                suma3=0
                for h in range (k):
                    suma3+=L[k][h]*U[h][j]
                U[k][j]=(A[k][j]-suma3)/float(L[k][k]) 

            print ("Iteracion: ",k)
            print ("Matrix L")
            print np.array(L)
            print ("\n")
            print ("Matrix U")
            print np.array(U)
            print ("\n")
        return L,U

    def progressive(self, Z,B,L,n):
        for i in range (n):
            sum=0.0
            for p in range(i):
                sum += L[i][p]*Z[p]
            Z[i]=(B[i]-sum)/L[i][i]
        return Z
    def regressiveC(self,X,Z,U,n):
        for i in range (n-1,-1,-1):
            sum=0.0
            for p in range(i+1,n):
                sum += U[i][p]*X[p]
            X[i]=(Z[i]-sum)/U[i][i]
        return X