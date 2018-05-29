import sys
import numpy as np
import math




def main():
    nPuntos = int(sys.argv[1])
    val = float(sys.argv[2])
    xValues = sys.argv[3]
    yValues = sys.argv[4]

    x = xValues.split(";")
    x = np.array(x)
    x = x.astype(np.float)
    y = yValues.split(";")
    y = np.array(y)
    y = y.astype(np.float)
    xCopia = np.array(x.tolist())
    n = nPuntos-1
    tabla = np.zeros((n*4, n*4+1))
    b = np.zeros(n*4)

    numeroEcuacion = 1

    k = 0
    var = 0
    exp = 0
    cont = 1

    print("----------------------- ECUACIONES RESULTANTES -----------------------")
    print("")
    print("Ecuaciones producidas de f(x):")

    for i in range(n*2):
        exp = 3
        ecuacion = str(numeroEcuacion) + ") "
        for j in range(4):
            tabla[i][k + j] = math.pow(x[var], exp)
            if cont == 1:
                ecuacion = ecuacion + "a" + str(int((k/4)+1)) + "* (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
            elif cont == 2:
                ecuacion = ecuacion + "b" + str(int((k / 4) + 1)) + "* (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
            elif cont == 3:
                ecuacion = ecuacion + "c" + str(int((k / 4) + 1)) + "* (" + str(x[var]) + ")"
                ecuacion = ecuacion + " + "
            elif cont == 4:
                ecuacion = ecuacion + "d" + str(int((k / 4) + 1))
                cont = 0
            cont = cont + 1
            exp = exp - 1

        b[i] = y[var]
        ecuacion = ecuacion + " = " + str(b[i])

        print(ecuacion)

        numeroEcuacion = numeroEcuacion+1

        if i%2 == 1:
            k = k+4
        else:
            var = var + 1

    print(" ")
    print("Ecuaciones producidas de f'(x):")

    k = 0
    kaux = k+4
    m = n*2
    var = 1
    cont2 = 1

    for i in range(n-1):
        exp = 2
        ecuacion = str(numeroEcuacion) + ") "
        for j in range(3):
            tabla[m + i][k + j] = (3 - j) * math.pow(x[var], exp)
            tabla[m + i][kaux + j] = -(3 - j) * math.pow(x[var], exp)
            if cont2 == 1:
                ecuacion = ecuacion + str(3-j) + " * a" + str(int((k/4)+1))+" * (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
                ecuacion = ecuacion + str(-(3 - j)) + " * a" + str(int((kaux / 4)) + 1) + " * (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
            elif cont2 == 2:
                ecuacion = ecuacion + str(3 - j) + " * b" + str(int((k / 4) + 1)) + " * (" + str(x[var]) + ")"
                ecuacion = ecuacion + " + "
                ecuacion = ecuacion + str(-(3 - j)) + " * b" + str(int((kaux / 4)) + 1) + " * (" + str(x[var]) + ")"
                ecuacion = ecuacion + " + "
            elif cont2 == 3:
                ecuacion = ecuacion + "c" + str(int((k/4)+1))
                ecuacion = ecuacion + " + "
                ecuacion = ecuacion + "-c" + str(int((kaux/4)+1))
                cont2=0
            cont2 = cont2 + 1
            exp = exp - 1
        k = k+4
        kaux = kaux + 4
        b[m+i] = 0
        ecuacion = ecuacion + " = " + str(b[m+i])
        print(ecuacion)
        numeroEcuacion = numeroEcuacion + 1
        var = var +1

    print(" ")
    print("Ecuaciones producidas de f''(x):")

    cont3 = 1
    k = 0
    kaux = k + 4
    m = m + (n-1)
    var = 1

    for i in range(n-1):
        exp = 1
        ecuacion = str(numeroEcuacion) + ") "
        for j in range(2):
            tabla[m + i][k + j] = (6 - 4 * j) * math.pow(x[var], exp)
            tabla[m + i][kaux + j] = -(6 - 4 * j) * math.pow(x[var], exp)
            if cont3 == 1:
                ecuacion = ecuacion + str(6-4*j) + " * a" + str(int((k/4)+1)) + " * (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
                ecuacion = ecuacion + str(-(6 - 4 * j)) + " * a" + str(int((kaux / 4)) + 1) + " * (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
            elif cont3 == 2:
                ecuacion = ecuacion + str(6 - 4 * j) + " * b" + str(int((k / 4) + 1))
                ecuacion = ecuacion + " + "
                ecuacion = ecuacion + str(-(6 - 4 * j)) + " * b" + str(int((kaux / 4) + 1))
                cont3 = 0
            cont3 = cont3 + 1
            exp = exp - 1
        k = k + 4
        kaux = kaux + 4
        b[m+i] = 0
        ecuacion = ecuacion + " = " + str(b[m+1])

        print(ecuacion)

        numeroEcuacion = numeroEcuacion + 1
        var = var + 1

    cont4 = 1
    k = 0
    m = m + (n-1)
    var = 0
    for i in range(2):
        exp = 1
        ecuacion = str(numeroEcuacion) + ") "
        for j in range(2):
            tabla[m][k + j] = (6 - 4 * j) * math.pow(x[var], exp)
            if cont4 == 1:
                ecuacion = ecuacion + str(6 - 4 * j) + " * a" + str(int((k / 4) + 1)) + " * (" + str(x[var]) + ")^" + str(exp)
                ecuacion = ecuacion + " + "
            elif cont4 == 2:
                ecuacion = ecuacion + str(6 - 4 * j) + " * b" + str(int((k / 4) + 1))
                cont4 = 0
            cont4 = cont4 + 1
            exp = exp -1
        b[m] = 0
        ecuacion = ecuacion + " = " + str(b[m])

        print(ecuacion)

        k = (n*4)-4
        numeroEcuacion = numeroEcuacion + 1
        m = m + 1
        var = (len(x)-1)
    print("")
    print("")
    print("----------------------- SISTEMA DE ECUACIONES RESULTANTE -----------------------")
    print("")
    print("MATRIZ INICIAL")
    for i in range(len(b)):
        tabla[i][4 * n] = b[i]
    print("")
    marcasIni = titulosTabla(n*4)
    #print(np.array2string(marcasIni, separator=";")[1:-1])
    print(marcasIni)
    print(tabla)
    print("")
    print("")
    #PIVOTEO TOTAL
    matrizFinal, marcas, exito = gaussianaConPivoteoTotal(tabla, n*4)

    marcasFin = np.array(['  ' for k in range(n*4)], dtype=str)
    #print(marcas)
    for i in range(len(marcas)):
        marcasFin[i] = marcasIni[int(marcas[i])]
    #print(np.array2string(marcasFin, separator=";")[1:-1])
    print("MATRIZ FINAL POR PIVOTEO TOTAL")
    print("")
    print(marcasFin)
    print(matrizFinal)
    #FUNCION POR TRAMOS

    #RESULTADO EVALUACION X
    x = sustitucionRegresiva(matrizFinal, n*4)
    #print("X")
    #print(x)
    #print(marcasFin)
    coeficientes = {}
    for i in range(len(x)):
        coeficientes[marcasFin[i]] = x[i]


    funcion = "f(x) = { \n"
    for i in range(n):
        #a1*x^3 + a2*x^2 + a3*x + a4
        fila = ""
        #fila = fila + "a" + str(int((k / 4) + 1)) + "* (x)^" + str(exp)
        fila = fila + str(coeficientes[("a")+str(i+1)]) + " * X^3"
        fila = fila + " + "
        fila = fila + str(coeficientes[("b")+str(i+1)]) + " * X^2"
        fila = fila + " + "
        fila = fila + str(coeficientes[("c")+str(i+1)]) + " * X"
        fila = fila + " + "
        fila = fila + str(coeficientes[("d")+str(i+1)])
        intervalo = str(xCopia[i]) + " <= X <= " + str(xCopia[i+1])
        funcion = funcion + fila +" -----> " + intervalo + "\n"
    print("")
    print("----------------------- RESULTADO FINAL -----------------------")
    print("")
    print("FUNCION POR TRAMOS")
    print("")
    funcion = funcion + "}"
    print(funcion)
    xOrden = organizarX(marcasFin, marcasIni, x)
    ind = 0
    if val >= xCopia[0]:
        if val <= xCopia[len(xCopia)-1]:
            for i in range(len(xCopia)-1):
                if val>=xCopia[i] and val<xCopia[i+1]:
                    ind = i
        else:
            ind = len(xCopia)-2

    resp = 0.0
    for i in range(4):
        resp = resp + xOrden[(ind*4)+i]*math.pow(val, 3-i)

    print("")
    print("")
    print("RESULTADO DE LA EVALUACION")
    print("")
    print("f("+str(val)+") = "+str(resp))


def organizarX(marcas, original, x):
    for i in range(len(original)):
        for j in range(len(original)):
            if original[i] == marcas[j]:
                temp = x[i].tolist()
                x[i] = x[j]
                x[j] = np.array(temp)
                temp2 = marcas[i].tolist()
                marcas[i]=marcas[j]
                marcas[j] = np.array(temp2)
    return x


def titulosTabla(n):
    #print(n)
    cont = 0
    cont2 = 1
    #marcas = np.empty(n,dtype=str)
    marcas = np.array(['  ' for k in range(n)],dtype=str)
    for i in range(n):
        temp = ""
        if cont == 0:
            marcas[i] = "a" + str(cont2)
        elif cont == 1:
            marcas[i] = "b" + str(cont2)
        elif cont == 2:
            marcas[i] = "c" + str(cont2)
        elif cont == 3:
            marcas[i] = "d" + str(cont2)
            cont = -1
            cont2 = cont2 + 1
        #temp = temp + str(cont2)
        #marcas[i] = temp
        cont = cont + 1
    return marcas

def sustitucionRegresiva(matrizFinal, tam):
    x = np.zeros(tam)
    for i in range(tam - 1, -1, -1):
        sumatoria = 0.0
        for p in range(i + 1, tam):
            sumatoria += matrizFinal[i][p] * x[p]
        x[i] = (matrizFinal[i][tam] - sumatoria) / float(matrizFinal[i][i])
    return x

def gaussianaConPivoteoTotal(Ab, tam):
    marcas = np.arange(tam)
    for k in range(0, tam - 1):
        #print("+ ETAPA %d \n" %k)
        #print ("Iteracion ", k, "\tam")
        #print (Ab)
        Ab, marcas, exito = pivoteoTotal(Ab, k, marcas, tam)
        if not exito:
            #print("##################################")
            #print("El sistema no tiene solucion unica")
            #print("##################################")
            return Ab, False
        #print("PIVOTEO PARCIAL:")
        #print (Ab)
        #print("Multiplicadores")
        for i in range(k + 1, tam):
            if Ab[k][k] == 0.0:
                #print("##################################")
                #print("El sistema no tiene solucion unica")
                #print("##################################")
                return Ab, marcas,False
            multiplicador = Ab[i][k] / Ab[k][k]
            #print("- Multiplicador %d = %f" %(i, multiplicador))
            #print ("Multiplicador ", i, " = ", multiplicador)
            for j in range(k, tam + 1):
                Ab[i][j] = Ab[i][j] - multiplicador * Ab[k][j]
        #print("\nMatriz parcial")
        arregloParcial = np.array(Ab)
        np.set_printoptions(suppress=True)
        #print(arregloParcial)
        #print("\n-------------------------------------------------------\n")
        #print ("\tam", "Matriz parcial  \tam", np.array(Ab), "\tam")
    return Ab, marcas, True

def pivoteoTotal(Ab, k, marcas, tam):
    mayor = 0
    fila_mayor = k
    columna_mayor = k
    for r in range(k,tam):
        for s in range(k,tam):
            if abs(Ab[r][s]) > mayor:
                mayor = abs(Ab[r][s])
                fila_mayor = r
                columna_mayor = s
    if mayor == 0:
        return Ab, marcas, False
    else:
        if fila_mayor != k:
            aux= np.array(Ab[fila_mayor]).tolist()
            Ab[fila_mayor]=Ab[k]
            Ab[k]=np.array(aux)
        if columna_mayor != k:
            for row in Ab:
                temp = float(row[columna_mayor])
                row[columna_mayor] = row[k]
                row[k] = temp

                #row[k] = row[columna_mayor]
                #row[columna_mayor] = row[k]
            marcTemp = marcas[columna_mayor].tolist()
            marcas[columna_mayor] = marcas[k]
            marcas[k] = np.array(marcTemp)

            #marcas[k]=marcas[columna_mayor]
            #marcas[columna_mayor] = marcas[k]
    return Ab,marcas, True


main()