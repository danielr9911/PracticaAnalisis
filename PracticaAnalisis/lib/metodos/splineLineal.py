import numpy as np
import sys

def main():
    n = int(sys.argv[1])
    val = float(sys.argv[2])
    xValues = sys.argv[3]
    yValues = sys.argv[4]

    x = xValues.split(";")
    x = np.array(x)
    x = x.astype(np.float)
    y = yValues.split(";")
    y = np.array(y)
    y = y.astype(np.float)

    resultado = 0

    for i in range(n-1):
        bi = (y[i+1]-y[i])/(x[i+1]-x[i])
        if val >= x[i] and val <= x[i+1]:
            resultado = y[i] + (bi * (val-x[i]))


main()