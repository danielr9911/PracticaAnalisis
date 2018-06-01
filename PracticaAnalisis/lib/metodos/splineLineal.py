import numpy as np
import sys

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

    resultado = 0
    funcion = "f(x) = { \n"
    for i in range(n-1):
        mi = (y[i+1]-y[i])/(x[i+1]-x[i])
        bi = y[i] - (mi * x[i])
        #print(mi)
        #print(bi)
        ecuacion = "%f * x + %f " % (mi, bi)
        intervalo = str(x[i]) + " <= X <= " + str(x[i + 1])
        ecuacion = ecuacion + " -----> " + intervalo
        #print(ecuacion)
        funcion = funcion + ecuacion + "\n"
        if val >= x[i] and val <= x[i+1]:
            resultado = y[i] + (mi * (val-x[i]))
            #print(resultado)

    print("FUNCION POR TRAMOS")
    print("")
    funcion = funcion + "}"
    print(funcion)

    print("")
    print("")
    print("RESULTADO DE LA EVALUACION")
    print("")
    print("f(" + str(val) + ") = " + str(resultado))

main()