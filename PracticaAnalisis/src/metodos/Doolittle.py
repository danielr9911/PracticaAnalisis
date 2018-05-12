import numpy as np
import sys
from math import *

'''
def readMatrix(file,size):
    L = np.zeros((size, size))
    U = np.zeros((size, size))
    A = np.zeros((size, size))
    B = np.zeros(size)
    Z = np.zeros(size)
    X = np.zeros(size)
    for i in range (size):
        cont=0
        #fileMio=file.readline().replace("\n","").split(" ")
        #linea=fileMio[0:size]
        for j in linea:
            A[i][cont]=float(j) 
            cont+=1
        valorB=fileMio[len(fileMio)-1]
        B[i]=float(valorB)

    return L,U,A,B,Z,X


def crout (L,U,A,n):    
    for k in range(n):
        suma1=0
        for m in range (k):
            suma1+=L[k][m]*U[m][k]
        L[k][k]=A[k][k]-suma1
        U[k][k]=1
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
        print (np.array(L))
        print ("\n")
        print ("Matrix U")
        print (np.array(U))
        print ("\n")
    return L,U
'''

def interpretarMatriz(n,b,a):
    matrizB = np.zeros(n)
    matrizA = []
    b = b[1:-1]
    matrizB = np.fromstring(b,dtype=float,sep=",")
    a = a[1:-1]
    temp = a.split(":")    
    for i in range(n):
        fila = temp[i]
        fila = fila[1:-1]
        mtemp = np.fromstring(fila,dtype=float,sep=",")
        matrizA.append(mtemp)
    matrizA = np.array(matrizA)
    return matrizB, matrizA

def progressiveDoolitlle(Z,B,L,n):
    for i in range (n):
        sum=0.0
        for p in range(i):
            sum += L[i][p]*Z[p]
        Z[i]=(B[i]-sum)/L[i][i]
    return Z

def regressiveDoolitle(X,Z,U,n):
    for i in range (n-1,-1,-1):
        sum=0.0
        for p in range(i+1,n):
            sum += U[i][p]*X[p]
        X[i]=(Z[i]-sum)/U[i][i]
    return X

def Doolittle(A, B, n):
    L = np.zeros((n, n))
    U = np.zeros((n, n))
    Z = np.zeros(n)
    X = np.zeros(n)
    
    for k in range(n):
        print ("+ ETAPA: %d \n") %k
        print ("Matriz L")
        print (np.array(L))
        print ("\n")
        print ("Matrix U")
        print (np.array(U))
        print ("\n")
        suma1=0
        if float(U[k][k]) == 0.0 or float(L[k][k]) == 0.0:
            print("##################################")
            print("El sistema no tiene solucion unica")
            print("##################################")
            return L, U, False

        for m in range (k):
            #fila (L) * columna (U)
            suma1+=L[k][m]*U[m][k]
        U[k][k]=A[k][k]-suma1
        L[k][k]=1
        for i in range (k,n):
            #Crear Matriz L
            suma2=0
            for p in range (0,k):
                suma2+=L[i][p]*U[p][k]
            L[i][k]=(A[i][k]-suma2)/float(U[k][k])

        for j in range (k+1,n):
            #Crear Matrix U
            suma3=0
            for h in range (k):
                suma3+=L[k][h]*U[h][j]
            U[k][j]=(A[k][j]-suma3)/float(L[k][k]) 
    return L,U, True

def main():
    n = int(sys.argv[1])
    b = sys.argv[2]
    a = sys.argv[3]

    matrizB, matrizA = interpretarMatriz(n, b, a)


    #print(matrizB)
    #print(matrizA)
    #print(Ab)
    MatrizL, MatrizU, exito = Doolittle(matrizA,matrizB,n)
    
    if exito:
        Z = np.zeros(n)
        X = np.zeros(n)
        Z=progressiveDoolitlle(Z,b,MatrizL,n)
        X=regressiveDoolitle(X,Z,MatrizU,n)
        
        print("!")
        print(MatrizL)
        print("!")
        print(MatrizU)
        print("!")

        for i, x in enumerate(X):
            print ("x{0} = {1}  ".format(i + 1, x))
        print("\n")
        for i, x in enumerate(Z):
            print ("z{0} = {1}  ".format(i + 1, x))

        #print ("Matriz final\n ", matrizFinal)
    else: 
        print("!")
        cero = np.zeros((n, n + 1))
        print(cero)
        print("!")
        print(cero)
        print("!")
        print("El sistema no tiene solucion unica")

main()

'''    
def main():
    name=sys.argv[1]
    
    file=open(name)
    size=int(file.readline())
    L,U,A,B,Z,X=readMatrix(file,size)
    
    L,U=crout(L,U,A,size)
    Z=progressive(Z,B,L,size)
    X=regressiveC(X,Z,U,size)
    print ("Matrix A")
    print (np.array(A))
    print ("\n")
    print ("Matrix L")
    print (np.array(L))
    print ("\n")
    print ("Matrix U")
    print (np.array(U))
    print ("\n")
    print ("Vector z")
    print (np.array(Z))
    print ("\n")

    print ("Vector X")
    print (np.array(X))

main()
'''