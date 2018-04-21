def reglaFalsa(self, f, xi, xs, tol, iter, err):
    fxi = self.function(f,xi)
    fxs = self.function(f,xs)
    if fxi == 0:
        self.mensaje = "%f es una raíz") % xi
    elif fxs == 0:
        self. mensaje = "%f es una raíz" % xs
    elif fxi * fxs < 0:
        xm = xi - ((fxi)*(xs-xi)/(fxs-fxi))
        fxm = self.function(f,xm)
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
            fxm = self.function(xm)
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
            self.mensaje = "%f es aproximación a una raiz con una tolerancia de %f " % (xm, tol)
        else:
            self.mensaje = "Fracaso en %d iteraciones" % iter
    else:
        self.mensaje = "El intervalo es inadecuado"
    return (self.mensaje, self.data)


