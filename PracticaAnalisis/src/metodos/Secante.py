def f(i):
    return i+1

def secante(self, x0, x1, Tol, iteraciones):
    fx0 = f(x0)
    if (fx0 == 0):
        print (x0 ,"es raíz")
    else:
        fx1 = f(x1)
        contador = 0
        error = Tol + 1
        denominador = fx1 - fx0
    while error > Tol and  fx1 != 0 and denominador != 0 and contador < iteraciones:
        x2 = x1 - ( (fx1 * (x1 - x0)/denominador) )
        error = abs(x2 - x1)
        x0 = x1
        fx0 = fx1
        x1 = x2
        fx1 = f(x1)
        denominador = fx1 - fx0
        contador = contador + 1
    if fx1 == 0:
        print(x1, " es una raíz")
    elif error < Tol:
        print(x1, " es aproximación a una raíz con una tolerancia de ", Tol)
    elif denominador == 0:
        print("Hay una posible raíz múltiple")
    else:
        print("fracaso en", iteraciones, "iteraciones")
