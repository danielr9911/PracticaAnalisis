def f(i):
    return i+1

def df(i):
    return i+1

def ddf(i):
    return i+1


def raicesMultiples(self, f, df, ddf, x0, tol, iter, err):
    self.mensaje = ""
    self.data = []
    fx = self.funcion(f, x0)
    dfx = self.funcion(df, x0)
    ddfx = self.funcion(ddf, x0)
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
        x1 = x0 - ((fx * dfx) / ((dfx ** 2) - (fx * ddfx)))
        fx = self.funcion(f, x1)
        dfx = self.funcion(df, x1)
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
        fila.append(ddf)
        fila.append(error)
        self.data.append(fila)
    if fx == 0:
        self.mensaje = "%f es una raiz" % x0
    elif error < tol:
        self.mensaje = "%f es aproximación a una raiz con una tolerancia de %f" % (x1, tol)
    else:
        self.mensje = "Fracaso en %d iteraciones" % iter
    print(self.mensaje, self.data)
    return (self.mensaje, self.data)
