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

    print("Sin tabla")
    print("!")

    print("POLINOMIOS Li(x):")

    resultado = 0
    pol = "P(x): "
    for k in range(n):
        productoria = 1
        termino = ""
        for i in range(n):
            if i!=k:
                productoria = productoria * (val - x[i]) / (x[k] - x[i])
                #termino = termino + ("[(x-"+x[i]+")/("+x[k]+"-"+x[i]+")]")
                termino = termino + "[(x-%f)/(%f-%f)]" %(x[i],x[k],x[i])

        temp = "L%f(x): " %k
        temp = temp + termino
        if y[k]>0:
            pol = pol + "+"
        pol = pol + str(y[k]) + "*" + termino +"\n"
        resultado = resultado + (productoria * y[k])

    print("----------------------------------------")
    print("POLINOMIO:")
    print(pol.replace("\n", "").replace(")(", ")*("))
    print(pol)
    print("!")
    print(pol.replace("\n", "").replace(")(", ")*("))
main()