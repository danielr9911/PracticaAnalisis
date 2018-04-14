def f(i):
    return i+1

def biseccion(self, xi, xs, tol, iter):
    fxi = f(xi)
    fxs = f(xs)
    if fxi == 0:
        print(xi, " es una raíz")
    elif fxs == 0:
        print(xs, " es una raíz")
    elif fxi * fxs < 0:
        xm = (xi+xs)/2
        fxm = f(xm)
        cont = 1
        error = tol + 1
        while fxm != 0 and error > tol and cont < iter:
            if fxi * fxm < 0:
                xs = xm
                fxs = fxm
            else:
                xi = xm
                fxi = fxm
            xaux = xm
            xm = (xi + xs) / 2
            fxm = f(xm)
            error = abs(xm - xaux)
            cont = cont + 1
        if fxm == 0:
            print(xm, " es una raíz")
        elif error < tol:
            print(xm, " es aproximación a una raíz con una tolerancia de ", tol)
        else:
            print("Fracaso en ", iter, " iteraciones")
    else:
        print("El intervalo es inadecuado")