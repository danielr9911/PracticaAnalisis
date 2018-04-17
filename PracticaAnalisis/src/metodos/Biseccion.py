from py_expression_eval import Parser


def f(i):
    sFuncion = "exp(3*x-12) + x*cos(3*x) - x^2 + 4"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def biseccion(xi, xs, tol, iter):
    tabla = []
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
        fila = []
        fila.append(cont-1)
        fila.append(xi)
        fila.append(xs)
        fila.append(xm)
        fila.append(fxm)
        fila.append(0)
        tabla.append(fila)
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
            fila = []
            fila.append(cont - 1)
            fila.append(xi)
            fila.append(xs)
            fila.append(xm)
            fila.append(fxm)
            fila.append(error)
            tabla.append(fila)
        if fxm == 0:
            print(xm, " es una raíz")
        elif error < tol:
            print(xm, " es aproximación a una raíz con una tolerancia de ", tol)
        else:
            print("Fracaso en ", iter, " iteraciones")
    else:
        print("El intervalo es inadecuado")
    return tabla


if __name__ == '__main__':
    print (biseccion(xi=2,xs=3,tol=0.0005,iter=11))