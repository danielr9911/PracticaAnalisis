import threading

import numpy as np
import sys

def imprimirTabla(tabla, n, x):
    nx = np.column_stack((range(n), x))
    tablaAum = np.hstack((nx, tabla))
    t = ""
    for i in range(len(tablaAum)):
        for j in range(len(tablaAum[0])):
            if j != (len(tablaAum[0])-1):
                t = t + str(tablaAum[i][j]) + ";"
            else:
                t = t + str(tablaAum[i][j])
        if i!=(len(tablaAum)-1):
            t = t + ":"
    print(t)

def nevilleParalelo(x,i,j,tabla,val):
    if (x[i] - x[i - j]) == 0.0:
        print("Se encontro una division por cero")
        ban = False
    else:
        tabla[i][j] = ((val - x[i - j]) * tabla[i][j - 1] - ((val - x[i]) * tabla[i - 1][j - 1])) / (x[i] - x[i - j])

def main():
    n = int(sys.argv[1])
    val = float(sys.argv[2])
    xValues = sys.argv[3]
    yValues = sys.argv[4]

    x = xValues.split(";")
    x = np.array(x)
    x = x.astype(np.float)
    y = yValues.split(";")
    y = np.array(y)
    y = y.astype(np.float)

    tabla = np.zeros((n, n))
    for i in range(n):
        tabla[i][0] = y[i]
    ban = True
    for i in range(n):
        for j in range(1,i+1):
            t = threading.Thread(target=nevilleParalelo, args=(x,i,j,tabla,val))
            t.start()
            t.join()

    if ban:
        imprimirTabla(tabla, n, x)
        print("!")
        print("RESULTADO DE LA EVALUACION:")
        res = "f(%f) = %f" % (val, tabla[n-1][n-1])
        print(res)

main()