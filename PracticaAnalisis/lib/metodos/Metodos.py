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
        self.mensaje = ""
        self.data = []
        fxi = self.funcion(f,xi)
        fxs = self.funcion(f, xs)
        if fxi == 0:
            self.mensaje = "%s es una raiz" % str(xi)
        elif fxs == 0:
            self.mensaje = "%s es una raiz" % str(xs)
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
                self.mensaje = "%s es una raiz" % str(xm)
            elif error < tol:
                self.mensaje = "%s es aproximacion a una raiz con una tolerancia de %s" % (str(xm), str(tol))
            else:
                self.mensaje = "Fracaso en %d iteraciones" % iter
        else:
            self.mensaje = "El intervalo es inadecuado"
        return (self.mensaje, self.data)

    def reglaFalsa(self, f, xi, xs, tol, iter, err):
        self.mensaje = ""
        self.data = []
        fxi = self.funcion(f, xi)
        fxs = self.funcion(f, xs)
        if fxi == 0:
            self.mensaje = "%s es una raíz" % str(xi)
        elif fxs == 0:
            self.mensaje = "%s es una raíz" % str(xs)
        elif fxi * fxs < 0:
            xm = xi - ((fxi) * (xs - xi) / (fxs - fxi))
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
                xm = xi - ((fxi) * (xs - xi) / (fxs - fxi))
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
                self.mensaje = "%s es una raiz" % str(xm)
            elif error < tol:
                self.mensaje = "%s es aproximacion a una raiz con una tolerancia de %s " % (str(xm), str(tol))
            else:
                self.mensaje = "Fracaso en %d iteraciones" % iter
        else:
            self.mensaje = "El intervalo es inadecuado"
        print(self.mensaje, self.data)
        return (self.mensaje, self.data)

    def raicesMultiples(self, f, df, ddf, x0, tol, iter, err):
        self.mensaje = ""
        self.data = []
        fx = self.funcion(f,x0)
        dfx = self.funcion(df, x0)
        ddfx = self.funcion(ddf,x0)
        cont = 0
        error = tol + 1
        fila = []
        fila.append(cont)
        fila.append(x0)
        fila.append(fx)
        fila.append(dfx)
        fila.append(ddfx)
        fila.append(0)
        self.data.append(fila)
        while fx != 0 and error > tol and cont < iter:
            x1 = x0 - ((fx * dfx) / ((dfx**2) - (fx*ddfx)))
            fx = self.funcion(f,x1)
            dfx = self.funcion(df,x1)
            ddfx = self.funcion(ddf, x1)
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
            fila.append(ddfx)
            fila.append(error)
            self.data.append(fila)
        if fx == 0:
            self.mensaje= "%s es una raiz" % str(x0)
        elif error < tol:
            self.mensaje = "%s es aproximacion a una raiz con una tolerancia de %s" % (str(x0), str(tol))
        else:
            self.mensje = "Fracaso en %d iteraciones" %iter
        print(self.mensaje, self.data)
        return (self.mensaje, self.data)

    def newton(self, f, df, x0, tol, iter, err):
        self.mensaje = ""
        self.data = []
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
            self.mensaje = "%s es una raiz" % str(x0)
        elif error < tol:
            self.mensaje = "%s es aproximacion a una raiz con una tolerancia de %s" % (str(x1), str(tol))
        elif dfx == 0:
            self.mensaje = "%s es una posible raiz multiple" % str(x1)
        else:
            self.mensaje = "Fracaso en %d iteraciones" % iter
        print(self.mensaje, self.data)
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
            fila = []
            fila.append(contador)
            fila.append(x0)
            fila.append(yn)
            fila.append(error)
            self.data.append(fila)
        if yn == 0:
            self.mensaje = "%s es raiz" % str(x0)
        elif error < tol :
            self.mensaje = "%s es aproximacion con una tol: %s" % (str(x0), str(tol))
        else:
            self.mensaje = "El metodo fracaso en %d iteraciones" % iter
        return (self.mensaje, self.data)

    def busquedas_incrementales(self, f, x0, delta, iter):
        self.mensaje = ""
        self.data = []
        fx0 = self.funcion(f,x0)
        contador = 0
        fila = [] #iter, xn, fXn,
        fila.append(contador)
        fila.append(x0)
        fila.append(fx0)
        self.data.append(fila)
        if fx0 == 0:
            self.mensaje =  "%s es una raiz" % str(x0)
        else:
            x1 = x0 + delta
            cont = 1
            fx1 = self.funcion(f, x1)
            while fx0 * fx1 > 0 and cont < iter:
                x0 = x1
                fx0 = fx1
                x1 = x0 + delta
                fx1 = self.funcion(f, x1)
                cont = cont + 1
                fila = []
                fila.append(cont-1)
                fila.append(x0)
                fila.append(fx0)
                self.data.append(fila)
            fila = []
            fila.append(cont)
            fila.append(x1)
            fila.append(fx1)
            self.data.append(fila)
            if fx1 == 0:
                self.mensaje = "%s es una raiz" % str(x1)
            elif fx0 * fx1 < 0:
                self.mensaje = "Hay una raiz entre %s y %s" % (str(x0), str(x1))
            else:
                self.mensaje = "Fracaso en iteraciones %d" %iter

        return (self.mensaje, self.data)

    def secante(self, f, x0, x1, tol, iter, err):        
        self.mensaje = ""
        self.data = []
        fx0 = self.funcion(f,x0)
        if (fx0 == 0):
            self.mensaje = "%s es raiz" % str(x0)
        else:
            fx1 = self.funcion(f,x1)
            contador = 0
            error = tol + 1
            denominador = fx1 - fx0
            fila = []
            fila.append(contador)
            fila.append(x0)
            fila.append(fx0)
            fila.append(0)
            self.data.append(fila)
            contador = contador + 1
            fila = []
            fila.append(contador)
            fila.append(x1)
            fila.append(fx1)
            fila.append(0)
            self.data.append(fila)
            contador = contador + 1
        while error > tol and  fx1 != 0 and denominador != 0 and contador < iter:
            x2 = x1 - ( (fx1 * (x1 - x0)/denominador) )
            if err == 0:
                error = abs(x2 - x1)
            else:
                error = abs((x2 - x1)/x2)
            x0 = x1
            fx0 = fx1
            x1 = x2
            fx1 = self.funcion(f,x1)
            denominador = fx1 - fx0
            contador = contador + 1
            fila = []
            fila.append(contador - 1)
            fila.append(x1)
            fila.append(fx1)
            fila.append(error)
            self.data.append(fila)
        if fx1 == 0:
            self.mensaje = "%s es una raiz" % str(x1)
        elif error < tol:
            self.mensaje = "%s es aproximacion a una raiz con una tolerancia de %s" % (str(x1), str(tol))
        elif denominador == 0:
            self.mensaje = "Hay una posible raiz multiple"
        else:
            self.mensaje = "fracaso en %d iteraciones" % iter
        print(self.mensaje, self.data)
        return (self.mensaje, self.data)
