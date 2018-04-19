import py_expression_eval

class ExpressionEval:
    __gui = None

    def __init__(self, gui):
        self.__gui = gui

    def funcion(func,i):
        parser = py_expression_eval.Parser()
        funcion = parser.parse(func)
        res = funcion.evaluate({"x": i})
        return res
