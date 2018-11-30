import time                                                                                                                                                                                                  
def decorator1(func):
    def wrapper1(*args, **kw):
        print(time.time())
        func(*args, **kw)
    return wrapper1

@decorator1
def f2(func_name, func_name1):
    print('a function:' + func_name)
    print('a function:' + func_name1)

@decorator1
def f3(func_name, func_name1, **kw):
    print('a function:' + func_name)
    print('a function:' + func_name1)
    print(kw)
f3('123','2', a=1, b=2, c='321')
