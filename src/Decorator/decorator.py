import time

def get_time(func):
    def w(*arg,**argv):
        start = time.time()
        index = func(*arg,**argv)
        end = time.time()
        return index, f'time -> {end-start}'
    return w    

@get_time
def search(arr:list[int], item:int) ->int:
    for index,number in enumerate(arr):
        if number==item:
            return index
    return -1

@get_time
def test(*a,**b):
    print(a)
    print(b)
    pass


if __name__ == "__main__":
    arr= [i for i in range(100000000)]
    index,time = search(arr,5000)
    print(index,time)


    # test(1,2,3,4,5,6,7,8,9,[],[],[],a=7,j=9,barak=[])

