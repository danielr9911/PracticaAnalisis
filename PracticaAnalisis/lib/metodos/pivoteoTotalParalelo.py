import sys
import threading

import numpy as np


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


def pivoteoTotal(Ab, k, marcas, tam):
    mayor = 0
    fila_mayor = k
    columna_mayor = k
    for r in range(k, tam):
        for s in range(k, tam):
            if abs(Ab[r][s]) > mayor:
                mayor = abs(Ab[r][s])
                fila_mayor = r
                columna_mayor = s
    if mayor == 0:
        return Ab, marcas, False
    else:
        if fila_mayor != k:
            aux = np.array(Ab[fila_mayor]).tolist()
            Ab[fila_mayor] = Ab[k]
            Ab[k] = np.array(aux)
        if columna_mayor != k:
            for row in Ab:
                temp = float(row[columna_mayor])
                row[columna_mayor] = row[k]
                row[k] = temp

                # row[k] = row[columna_mayor]
                # row[columna_mayor] = row[k]
            marcTemp = marcas[columna_mayor].tolist()
            marcas[columna_mayor] = marcas[k]
            marcas[k] = np.array(marcTemp)

            # marcas[k]=marcas[columna_mayor]
            # marcas[columna_mayor] = marcas[k]
    return Ab, marcas, True

def eliminacionParalelo(Ab, k, i, tam, marcas):
    if Ab[k][k] == 0.0:
        print("##################################")
        print("El sistema no tiene solucion unica")
        print("##################################")
        return Ab, marcas, False
    multiplicador = Ab[i][k] / Ab[k][k]
    print("- Multiplicador %d = %f" % (i, multiplicador))
    # print ("Multiplicador ", i, " = ", multiplicador)
    for j in range(k, tam + 1):
        Ab[i][j] = Ab[i][j] - multiplicador * Ab[k][j]

def gaussianaConPivoteoTotal(Ab, tam):
    marcas = np.arange(tam)
    for k in range(0, tam - 1):
        print("+ ETAPA %d \n" % k)
        # print ("Iteracion ", k, "\tam")
        # print (Ab)
        Ab, marcas, exito = pivoteoTotal(Ab, k, marcas, tam)
        if not exito:
            print("##################################")
            print("El sistema no tiene solucion unica")
            print("##################################")
            return Ab, False
        # print("PIVOTEO PARCIAL:")
        # print (Ab)
        print("Multiplicadores")
        for i in range(k + 1, tam):
            t = threading.Thread(target=eliminacionParalelo, args=(Ab, k, i, tam, marcas))
            t.start()
            t.join()
        print("\nMatriz parcial")
        arregloParcial = np.array(Ab)
        np.set_printoptions(suppress=True)
        print(arregloParcial)
        print("\n-------------------------------------------------------\n")
        # print ("\tam", "Matriz parcial  \tam", np.array(Ab), "\tam")
    return Ab, marcas, True


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
    # print(matrizB)
    # print(matrizA)
    Ab = matrixAum(matrizA, matrizB, tam)
    # print(Ab)
    matrizFinal, marcas, exito = gaussianaConPivoteoTotal(Ab, tam)

    if exito:
        print("!")
        print(matrizFinal)
        # print ("Matriz final\tam ", matrizFinal)

        x = sustitucionRegresiva(matrizFinal, tam)
        print("!")
        for i, x in zip(marcas, x):
            print("x{0} = {1}  ".format(i + 1, x))
    else:
        print("!")
        cero = np.zeros((tam, tam + 1))
        print(cero)
        print("!")
        print("El sistema no tiene solucion unica")


main()