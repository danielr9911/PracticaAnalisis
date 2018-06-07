import sys
import numpy as np
import threading

def matrixAum(A, b, tam):
    aTemp = A.tolist()
    for i in range(tam):
        filaTemp = aTemp[i]
        filaTemp.append(b[i])
        aTemp[i] = np.array(filaTemp)
    Ab = np.array(aTemp)
    return Ab


def interpretarMatriz(tam, b, a):
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
    return matrizB, matrizA

def eliminacionParalelo(Ab, k, i, tam):
    if float(Ab[k - 1][k - 1]) == 0.0:
        print("##################################")
        print("El sistema no tiene solucion unica")
        print("##################################")
        return Ab, False
    multiplicador = Ab[i][k - 1] / float(Ab[k - 1][k - 1])
    print("- Multiplicador %d = %f") % (i, multiplicador)
    for j in range(k, tam + 2):
        Ab[i][j - 1] = Ab[i][j - 1] - multiplicador * Ab[k - 1][j - 1]

def eliminacionGaussiana(Ab, tam):
    for k in range(1, tam):
        num = k - 1
        print("+ ETAPA %d \n") % num
        print("Multiplicadores")
        for i in range(k, tam):
            t = threading.Thread(target=eliminacionParalelo, args=(Ab, k, i, tam))
            t.start()
            t.join()
        print("\nMatriz parcial")
        arregloParcial = np.array(Ab)
        #np.set_printoptions(suppress=True)
        #print(arregloParcial)
        imprimirMatriz(arregloParcial)
        print("\n-------------------------------------------------------\n")
    return Ab, True

def imprimirMatriz(matriz):
    n = len(matriz)
    print("----------------------------" * n)
    for i in range(n):
        elem = matriz[i]
        linea = "| "
        for j in range(len(elem)):
            linea = linea + str(elem[j])
            m = 20-len(str(elem[j]))
            linea = linea + (" "*m) + "| "
        print(linea)
    print("----------------------------" * n)

def sustitucionRegresiva(matrizFinal, tam):
    x = np.zeros(tam)
    for i in range(tam - 1, -1, -1):
        sumatoria = 0.0
        for p in range(i + 1, tam):
            sumatoria += matrizFinal[i][p] * x[p]
        x[i] = (matrizFinal[i][tam] - sumatoria) / float(matrizFinal[i][i])
    return x


def main():
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]

    matrizB, matrizA = interpretarMatriz(tam, b, a)

    Ab = matrixAum(matrizA, matrizB, tam)
    matrizFinal, exito = eliminacionGaussiana(Ab, tam)

    if exito:
        print("!")
        print(matrizFinal)
        #imprimirMatriz(matrizFinal)
        x = sustitucionRegresiva(matrizFinal, tam)
        print("!")
        for i, x in enumerate(x):
            print("x{0} = {1}  ".format(i + 1, x))
    else:
        print("!")
        cero = np.zeros((tam, tam + 1))
        print(cero)
        print("!")
        print("El sistema no tiene solucion unica")


main()