import sys
import numpy as np

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


def pivoteoParcial(Ab, k, tam):
    numMayor = abs(Ab[k][k])
    filaMayor = k
    for s in range(k + 1, tam):
        if (abs(Ab[s][k]) > numMayor):
            numMayor = abs(Ab[s][k])
            filaMayor = s
    #print ("Filamayor = ", filaMayor)
    #print ("numMayor = ", numMayor)
    if numMayor == 0:
        print("El sistema no tiene una solucion unica")
        return Ab
    else:
        if filaMayor != k:
            #print(Ab[filaMayor])
            #print(Ab[k])
            filaTemp = Ab[filaMayor].tolist()
            Ab[filaMayor] = Ab[k]
            Ab[k] = np.array(filaTemp)
            #print("-----")
            #print(Ab[filaMayor])
            #print(Ab[k])
            #Ab[k], Ab[filaMayor] = Ab[filaMayor], Ab[k]
            return Ab
        else:
            return Ab


def gaussianaConPivoteoParcial(Ab, tam):
    marcas = np.arange(tam)
    for k in range(0, tam - 1):
        print("+ ITERACION %d \n") %k
        #print ("Iteracion ", k, "\n")
        #print (Ab)
        Ab = pivoteoParcial(Ab, k, tam)
        #print("PIVOTEO PARCIAL:")
        #print (Ab)
        print("Multiplicadores")
        for i in range(k + 1, tam):
            multiplicador = Ab[i][k] / Ab[k][k]
            print("- Multiplicador %d = %f") %(i, multiplicador)
            #print ("Multiplicador ", i, " = ", multiplicador)
            for j in range(k, tam + 1):
                Ab[i][j] = Ab[i][j] - multiplicador * Ab[k][j]
        print("\nMatriz parcial")
        arregloParcial = np.array(Ab) 
        np.set_printoptions(suppress=True)
        print(arregloParcial)
        print("\n-------------------------------------------------------\n")
        #print ("\n", "Matriz parcial  \n", np.array(Ab), "\n")
    return Ab


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
    #print(matrizB)
    #print(matrizA)
    Ab = matrixAum(matrizA, matrizB, tam)
    #print(Ab)
    matrizFinal = gaussianaConPivoteoParcial(Ab, tam)
    print("!")
    print(matrizFinal)
    #print ("Matriz final\n ", matrizFinal)
    
    x = sustitucionRegresiva(matrizFinal, tam)
    print("!")
    for i, x in enumerate(x):
        print ("x{0} = {1}  ".format(i + 1, x))

main()