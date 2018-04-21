# -*- coding: utf-8 -*-
from py_expression_eval import Parser

class Metodos():
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
    
    def punto_fijo(self, f, g, x0, iter, tol, err):
        self.mensaje = ""
        self.data = []
        yn = self.funcion(f,x0)
        contador = 0
        error = tol + 1
        fila = [] #iter, xn, fXn, error
        fila.append(contador)
        fila.append(x0)
        fila.append(yn)
        fila.append(0)
        self.data.append(fila)
        while yn != 0 and error > tol and contador < iter :
            xn = self.funcion(g, x0)
            yn = self.funcion(f, xn)
            if err == 0:
                error = abs(xn - x0)
            else:
                error = abs((xn - x0)/xn)
            x0 = xn
            contador = contador + 1
            fila.append(contador)
            fila.append(x0)
            fila.append(yn)
            fila.append(error)
            self.data.append(fila)
        if yn == 0:
            self.mensaje = "%f es raíz" %x0
        elif error < tol :
            self.mensaje = "%f es aproximacion con una tol: %f" %(x0, tol)
        else:
            self.mensaje = "El metodo fracaso en %d iteraciones" %iter
        
        return (self.mensaje, self.data)

if __name__=='__main__':
    Metodos.punto_fijo(Metodos(None),"x*exp(x) - x^2 - 5*x - 3","(x*exp(x) - x^2 - 3) / 5", -0.5, 11, 0.0005, 0)


