import threading

import numpy as np
import sys

def lagrangeParalelo(x,i,k,productoria,val,termino):
    if i != k:
        if (x[k] - x[i]) == 0.0:
            print("Se encontro una division por cero")
            print("!")
            print("Se encontro una division por cero")
            print("!")
            print("0")
            ban = False
        else:
            productoria[0] = productoria[0] * (val - x[i]) / (x[k] - x[i])
            # termino = termino + ("[(x-"+x[i]+")/("+x[k]+"-"+x[i]+")]")
            termino[0] = termino[0] + "((x-%f)/(%f-%f))" % (x[i], x[k], x[i])

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
    pol = ""
    ban = True
    for k in range(n):
        productoria = [1]
        termino = [""]
        for i in range(n):
            t = threading.Thread(target=lagrangeParalelo, args=(x,i,k,productoria,val,termino))
            t.start()
            t.join()

        temp = "L%d(x): " % k
        temp = temp + termino[0]
        print(temp)
        if y[k] > 0:
            pol = pol + "+"
        pol = pol + str(y[k]) + "*" + termino[0] + "\n"
        resultado = resultado + (productoria[0] * y[k])

    if ban:
        print("----------------------------------------")
        print("POLINOMIO:")
        pol.replace("\n", "").replace(")(", ")*(")
        print("P(x): " + pol)
        print("----------------------------------------")
        print("RESULTADO:")
        res = "f(%f) = %f" % (val, resultado)
        print(res)
        print("!")
        print(pol.replace("\n", "").replace(")(", ")*("))


main()