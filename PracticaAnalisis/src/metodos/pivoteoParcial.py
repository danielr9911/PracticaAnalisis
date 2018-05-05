import sys
import numpy as np

def matrixAum(A,b,n):
    for i in range(n):
        A[i].append(b[i])
    return A

def interpretarMatriz(tam,b,a):
    matrizB = np.zeros(tam)
    matrizA = []
    b = b[1:-1]
    matrizB = np.fromstring(b,dtype=float,sep=",")
    a = a[1:-1]
    temp = a.split(";")
    for i in range(tam):
        fila = temp[i]
        fila = fila[1:-1]
        mtemp = np.fromstring(fila,dtype=float,sep=",")
        matrizA.append(mtemp)
    matrizA = np.array(matrizA)
    return matrizB, matrizA


def main():
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]

    matrizB, matrizA = interpretarMatriz(tam, b, a)
    print(matrizB)
    print(matrizA)

main()