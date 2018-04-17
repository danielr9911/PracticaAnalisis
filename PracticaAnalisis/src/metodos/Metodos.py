from py_expression_eval import Parser

class Metodos:
    __gui = None

    def __init__(self, gui):
        self.__gui = gui

    def funcion(self, func, i):
        parser = Parser()
        funcion = parser.parse(func)
        res = funcion.evaluate({"x": i})
        return res

    def busquedasIncrementales(self,f, x0, delta, iter):
        fx0 = self.funcion(f,x0)
        if fx0 == 0:
            print(x0, "Es una raíz")
        else:
            x1 = x0 + delta
            cont = 1
            fx1 = self.funcion(f,x1)
            while fx0 * fx1 > 0 and cont < iter:
                x0 = x1
                fx0 = fx1
                x1 = x0 + delta
                fx1 = self.funcion(f,x1)
                cont = cont + 1
            if fx1 == 0:
                print(x1, " es una raíz")
            elif fx0 * fx1 < 0:
                print("Hay una raíz entre ", x0, " y ", x1)
            else:
                print("Fracaso en ", iter, " iteraciones")

    def biseccion(self, f, xi, xs, tol, iter):
        tabla = []
        fxi = self.funcion(f,xi)
        fxs = self.funcion(f, xs)
        if fxi == 0:
            print(xi, " es una raíz")
        elif fxs == 0:
            print(xs, " es una raíz")
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
