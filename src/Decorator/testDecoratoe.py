def milk(func):
    def add(*arg,**argv):
        price=func()+3
        return price
    return add

@milk
def coffee():
    return 5

if __name__ == "__main__":
    print(coffee())
