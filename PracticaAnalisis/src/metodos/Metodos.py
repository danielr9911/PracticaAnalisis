# -*- coding: utf-8 -*-
from py_expression_eval import Parser

class Metodos:
    __gui = None
    mensaje = ""
    data = []

    def __init__(self, gui):
        self.__gui = gui

    def funcion(self, func, i):
        parser = Parser()
        funcion = parser.parse(func)
        res = funcion.evaluate({"x": i})
        return res

    def biseccion(self, f, xi, xs, tol, iter):
        fxi = self.funcion(f,xi)
        fxs = self.funcion(f, xs)
        if fxi == 0:
            self.mensaje = "%f es una raíz" % xi
        elif fxs == 0:
            self.mensaje = "%f es una raíz" % xs
        elif fxi * fxs < 0:
            xm = (xi + xs) / 2
            fxm = self.funcion(f, xm)
            cont = 1
            error = tol + 1
            fila = []
            fila.append(cont - 1)
            fila.append(xi)
            fila.append(xs)
            fila.append(xm)
            fila.append(fxm)
            fila.append(0)
            self.data.append(fila)
            while fxm != 0 and error > tol and cont < iter:
                if fxi * fxm < 0:
                    xs = xm
                    fxs = fxm
                else:
                    xi = xm
                    fxi = fxm
                xaux = xm
                xm = (xi + xs) / 2
                fxm = self.funcion(f, xm)
                error = abs(xm - xaux)
                cont = cont + 1
                fila = []
                fila.append(cont - 1)
                fila.append(xi)
                fila.append(xs)
                fila.append(xm)
                fila.append(fxm)
                fila.append(error)
                self.data.append(fila)
            if fxm == 0:
                self.mensaje = "%f es una raíz" % xm
            elif error < tol:
                self.mensaje = "%f es aproximación a una raíz con una tolerancia de %f" % (xm, tol)
            else:
                self.mensaje = "Fracaso en %d iteraciones" % iter
        else:
            self.mensaje = "El intervalo es inadecuado"
        print(self.mensaje, self.data)
        return (self.mensaje, self.data)
