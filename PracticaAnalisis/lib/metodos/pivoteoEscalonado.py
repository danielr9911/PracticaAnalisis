import numpy as np
import sys


def matrixAum(A,b,n):
    aTemp = A.tolist()
    for i in range(n):
        filaTemp = aTemp[i]
        filaTemp.append(b[i])
        aTemp[i] = np.array(filaTemp)
    Ab = np.array(aTemp)
    return Ab

def interpretarMatriz(tam,b,a):
    matrizB = np.zeros(tam)
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

def busquedaMayorFila(tam, matriz):
    vectorMayores = np.zeros(tam)
    for i in range(0,tam):
        for j in range(0,tam):
            if np.absolute(matriz[i][j]) > vectorMayores[i]:
                vectorMayores[i] = np.absolute(matriz[i][j])
    return vectorMayores

def eliminacionGaussiana(tam, ab):
    #print("matriz original\n",ab)
    vectorMayores = busquedaMayorFila(tam, ab)
    #print("Vector ", vectorMayores)
    for k in range(0, tam):
        print("+ ETAPA %d \n" % k)
        ab = pivoteoEscalonado(ab, k, tam, vectorMayores)
        print("\nMultiplicadores")
        for i in range(k+1,tam):
            multiplicador = ab[i][k] / ab[k][k]
            print("- Multiplicador %d = %f" % (i, multiplicador))
            for j in range(k,tam+1):
                ab[i][j] = ab[i][j] - (multiplicador*ab[k][j])
        print("\nMatriz parcial")
        #print(ab)
        imprimirMatriz(ab)
        print("\n##################################################\n")
    print("!")
    print(ab)
    resultado = sustitucionRegresiva(ab, tam)

    return resultado


def pivoteoEscalonado(ab, k, tam, vectorMayores):
    mayor = 0.0
    filaMayor = k
    cocientes = np.zeros(tam)

    for i in range(k,tam):
        cocientes[i] = np.absolute(ab[i][k])/vectorMayores[i]

    for j in range(k,tam):
        if cocientes[j] > mayor:
            mayor = cocientes[j]
            filaMayor = j

#   print("El cociente mayor es %f de la fila %f" % (mayor,filaMayor))
    if mayor == 0:
        print("El sistema no tiene solucion unica")
    else:
        if filaMayor != k:
            for i in range(0, ab[0].size):
                aux = ab[k][i]
                ab[k][i] = ab[filaMayor][i]
                ab[filaMayor][i] = aux
            aux2 = vectorMayores[k]
            vectorMayores[k] = vectorMayores[filaMayor]
            vectorMayores[filaMayor] = aux2
    #print("intercambio de filas\n")
    #print(ab)
    return ab

def sustitucionRegresiva(matrizFinal, tam):
    x = np.zeros(tam)
    for i in range(tam - 1, -1, -1):
        sumatoria = 0.0
        for p in range(i + 1, tam):
            sumatoria += matrizFinal[i][p] * x[p]
        x[i] = (matrizFinal[i][tam] - sumatoria) / float(matrizFinal[i][i])
    return x


def main():
    #ab = np.zeros((4,4))
    #ab = np.array([[2,-3,4,1,10],[-4,2,1,-2,-10],[1,3,-5,3,32],[-3,-1,1,1,-21]], dtype='f')
    tam = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]
    matrizB, matrizA = interpretarMatriz(tam, b, a)
    Ab = matrixAum(matrizA, matrizB, tam)

    resultado = eliminacionGaussiana(tam,Ab)
    print("!")
    for i, x in enumerate(resultado):
        print("x{0} = {1}  ".format(i + 1, x))

main()