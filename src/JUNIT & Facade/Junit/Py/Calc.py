class Calculator:

    def add(self,a:int, b:int) -> int:
        return a+b

    def sub(self,a:int, b:int):
        return a-b


    def mul(self,a:int, b:int):
        return a*b

    def div(self,a:int, b:int):
        if(b==0):
            raise ValueError("Cannot div by zero")
        return a/b


if __name__ == '__main__':
    c= Calculator()
    print(c.add(1,2))