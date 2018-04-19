from py_expression_eval import Parser

def f(i):
    sFuncion = "x*log(x)-x"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def df(i):
    sFuncion = "log(x)"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def ddf(i):
    sFuncion = "1/x"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def g(i):
    sFuncion = "x*log(x)"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res


def punto_fijo(xa, niter, tolerancia):
    yn = f(xa)
    contador = 0
    error = tolerancia + 1
    while yn != 0 and error > tolerancia and contador < niter :
        xn = g(xa)
        yn = f(xn)
        error = abs(xn - xa)
        xa = xn
        contador = contador + 1
    if yn == 0:
        print("%d es raíz" % xa)
    elif error < tolerancia :
        print("%d es aproximación con una tolerancia: %d", (xa, tolerancia))
    else:
        print("El método fracasó en %d iteraciones", niter)

if __name__ == '__main__':
    print (punto_fijo(xa=2.5,tolerancia=0.0005,niter=11))