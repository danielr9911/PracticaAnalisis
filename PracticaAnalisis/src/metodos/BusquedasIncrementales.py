def f(num):
    return num

def busquedasIncrementales(self, x0, delta, iter):
    if delta != 0:
        if iter > 0:
            y0 = f(x0)
            if y0 != 0:
                x1 = x0 + delta
                y1 = f(x1)
                cont = 1
                while y0*y1 > 0 and y1 != 0 and cont < iter:
                    x0 = x1
                    y0 = y1
                    x1 = x0 + delta
                    y1 = f(x1)
                    cont += 1
                if y1 == 0:
                    print(x1, "Es una raiz")
                elif y0*y1 < 0:
                    print(x0, x1, "Es un intervalo con raiz")
                else:
                    print("Fracaso para encontrar un intervalo en iteraciones")
            print(x0, "Es una raiz")
        print("El numero de iteraciones no puede ser menor a cero")
    print("Delta no puede ser cero")
