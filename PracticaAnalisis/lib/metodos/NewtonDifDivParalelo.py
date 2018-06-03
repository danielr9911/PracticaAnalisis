#!/usr/bin/python
import threading
from ast import literal_eval
import numpy as np
import sys


def imprimirTabla(tabla, n, x):
    nx = np.column_stack((range(n), x))
    tablaAum = np.hstack((nx, tabla))
    print(tablaAum)

def newtonParalelo(x,i,j,tabla):
    if (float(x[i]) - float(x[i - j])) == 0.0:
        print("Se encontro una division por cero")
        print("!")
        print("Se encontro una division por cero")
        print("!")
        print("0")
        ban = False
    else:
        tabla[i][j] = (float(tabla[i][j - 1]) - float(tabla[i - 1][j - 1])) / (float(x[i]) - float(x[i - j]))

def main():
    # (2,3);(3,5);(4,6)
    #listaPuntos = sys.argv[1]
    #puntos i] = lite= listaPuntos.split(";")
    #for i in range(len(puntos)):
    #    puntos[ral_eval(puntos[i])

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

    tabla = np.zeros((n,n))

    for i in range(n):
        tabla[i][0] = y[i]
    ban = True
    for i in range(n):
        for j in range(1,i+1):
            t = threading.Thread(target=newtonParalelo, args=(x,i,j,tabla))
            t.start()
            t.join()
    if ban:
        print("TABLA:")
        imprimirTabla(tabla, n, x)

        pol = "%f" %tabla[0][0]
        temp = ""
        resultado = tabla[0][0]
        aux = 1

        for i in range(1,n):
            temp = temp+"(x"+"-"+str(x[i-1])+")"
            #pol = pol + "\n"+(tabla[i][i]>0?"+":"")+(tabla[i][i]+"*"+temp);
            pol = pol + "\n"
            if tabla[i][i]>0:
                pol = pol + "+"
            pol = pol + str(tabla[i][i])
            pol = pol + "*" + temp

            aux = aux *(val-x[i-1])
            resultado = resultado + tabla[i][i] * aux

        print("!")
        print("POLINOMIO:")
        pol = pol.replace("--", "+")
        print("P(x): " + pol)
        print("----------------------------------------")
        print("RESULTADO:")
        res = "f(%f) = %f" %(val, resultado)
        print(res)

        print("!")
        print(pol.replace("\n", "").replace(")(", ")*("))

main()