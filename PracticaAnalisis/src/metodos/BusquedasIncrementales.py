def f(i):
    return i+1

def busquedasIncrementales(self, x0, delta, iter):
    fx0 = f(x0)
    if fx0 == 0:
        print(x0, "Es una raíz")
    else:
        x1 = x0 + delta
        cont = 1
        fx1 = f(x1)
        while fx0 * fx1 > 0 and cont < iter:
            x0 = x1
            fx0 = fx1
            x1 = x0 + delta
            fx1 = f(x1)
            cont = cont + 1
        if fx1 == 0:
            print(x1, " es una raíz")
        elif fx0 * fx1 < 0:
            print("Hay una raíz entre ", x0, " y ", x1)
        else:
            print("Fracaso en ", iter, " iteraciones")