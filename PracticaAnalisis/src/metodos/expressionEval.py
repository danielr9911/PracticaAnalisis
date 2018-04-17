from py_expression_eval import Parser

class ExpressionEval:
    __gui = None

    def __init__(self, gui):
        self.__gui = gui

    def funcion(func,i):
        parser = Parser()
        funcion = parser.parse(func)
        res = funcion.evaluate({"x": i})
        return res
