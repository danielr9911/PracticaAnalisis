from py_expression_eval import Parser

if __name__ == '__main__':
    parser = Parser()
    exp = "2+2"
    eval = parser.parse(exp)
    res = eval.evaluate({})
    print (res)