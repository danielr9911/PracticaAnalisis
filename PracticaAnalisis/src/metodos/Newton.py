# -*- coding: utf-8 -*-
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


def newton(self, f, x0, tol, iter, error):
    fx = f(x0)
    dfx = df(x0)
    cont = 0
    error = tol + 1
    while fx != 0 and dfx != 0 and error > tol and cont < iter:
        x1 = x0 - (fx/dfx)
        fx = f(x1)
        dfx = df(x1)
        error = abs(x1 - x0)
        x0 = x1
        cont = cont + 1
    if fx == 0:
        print(x0, " es una raíz")
    elif error < tol:
        print(x1, " es aproximación a una raíz con una tolerancia de ", tol)
    else:
        print("Fracaso en ", iter, " iteraciones")

if __name__ == '__main__':
    print (newton(x0=2.5,tol=0.0005,iter=11))

