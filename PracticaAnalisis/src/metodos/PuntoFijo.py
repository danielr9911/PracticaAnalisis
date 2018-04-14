def f(i):
    return i+1

def g(i):
    return i+1

def punto_fijo(xa, niter, tolerancia):
    yn = f(xa)
    contador = 0
    error = tolerancia + 1
    while yn != 0 and error > tolerancia and contador < niter :
        xn = g(xa)
        yn = f(xn)
        error = abs(xn - xa)
        xa = xn
        contador = contador + 1
    if yn == 0:
        print("%d es raíz" % xa)
    elif error < tolerancia :
        print("%d es aproximación con una tolerancia: %d", (xa, tolerancia))
    else:
        print("El método fracasó en %d iteraciones", niter)
