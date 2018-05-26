from ast import literal_eval
import numpy as np
import sys


def imprimirTabla(tabla, n, x):
    nx = np.column_stack((range(n), x))
    tablaAum = np.hstack((nx, tabla))
    print(tablaAum)



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

    for i in range(n):
        for j in range(1,i+1):
            tabla[i][j] = (tabla[i][j-1] - tabla[i-1][j-1])/(x[i] - x[i-j])

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

    print("RESULTADO:")
    res = "f(%f) = %f" %(val, resultado)
    print(res)

    print("!")
    print(pol.replace("\n", "").replace(")(", ")*("))

main()