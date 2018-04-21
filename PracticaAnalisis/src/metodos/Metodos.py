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

    def biseccion(self, f, xi, xs, tol, iter, err):
        fxi = self.funcion(f,xi)
        fxs = self.funcion(f, xs)
        if fxi == 0:
            self.mensaje = "%f es una raiz" % xi
        elif fxs == 0:
            self.mensaje = "%f es una raiz" % xs
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
                if err == 0:
                    error = abs(xm - xaux)
                else:
                    error = abs((xm - xaux) / xm)
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
                self.mensaje = "%f es una raiz" % xm
            elif error < tol:
                self.mensaje = "%f es aproximacion a una raiz con una tolerancia de %f" % (xm, tol)
            else:
                self.mensaje = "Fracaso en %d iteraciones" % iter
        else:
            self.mensaje = "El intervalo es inadecuado"
        return (self.mensaje, self.data)

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

if __name__ == '__main__':
    Metodos.newton(Metodos(None),'exp(-x)-x^2*cos(2*x-4)+6*x+3','-exp(-x)-2*x*cos(2*x-4)+2*x^2*sin(2*x-4)+6',-0.5,0.0005,11,0)
