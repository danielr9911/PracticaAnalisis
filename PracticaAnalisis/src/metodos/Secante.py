from py_expression_eval import Parser

def f(i):
    sFuncion = "x*log(x)-x"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def df(i):
    sFuncion = "log(x)"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def ddf(i):
    sFuncion = "1/x"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def g(i):
    sFuncion = "x*log(x)"
    parser = Parser()
    funcion = parser.parse(sFuncion)
    res = funcion.evaluate({"x": i})
    return res

def secante(x0, x1, Tol, iteraciones):
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

if __name__ == '__main__':
    print (secante(x0=2.5,x1=3.0,Tol=0.0005,iteraciones=11))