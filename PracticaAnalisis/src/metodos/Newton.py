def f(i):
    return i+1

def df(i):
    return i+1

def newton(self, x0, tol, iter):
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
