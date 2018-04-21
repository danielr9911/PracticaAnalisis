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

def newton(self, f, df, x0, tol, iter, err):
    mensaje = ""
    data = []
    fx = self.funcion(f,x0)
    dfx = self.funcion(df, x0)
    cont = 0
    error = tol + 1
    fila = []
    fila.append(cont)
    fila.append(x0)
    fila.append(fx)
    fila.append(dfx)
    fila.append(0)
    self.data.append(fila)
    while fx != 0 and dfx != 0 and error > tol and cont < iter:
        x1 = x0 - (fx/dfx)
        fx = self.funcion(f,x1)
        dfx = self.funcion(df,x1)
        if err == 0:
            error = abs(x1 - x0)
        else:
            error = abs((x1 - x0) / x1)
        x0 = x1
        cont = cont + 1
        fila = []
        fila.append(cont)
        fila.append(x0)
        fila.append(fx)
        fila.append(dfx)
        fila.append(error)
        self.data.append(fila)
    if fx == 0:
        self.mensaje = "%f es una raiz" % x0
    elif error < tol:
        self.mensaje = "%f es aproximacion a una raiz con una tolerancia de %f" % (x1, tol)
    elif dfx == 0:
        self.mensaje = "%f es una posible raíz múltiple" % (x1)
    else:
        self.mensaje = "Fracaso en %d iteraciones" % iter
    print(self.mensaje, self.data)
    return (self.mensaje, self.data)

