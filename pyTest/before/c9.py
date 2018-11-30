import time


def decorator1(func):
	def wrapper(*args):
		print(time.time())
		func(*args)
	return wrapper

@decorator1
def f1(func_name):
        print('a function:' + func_name)

@decorator1
def f2(func_name, func_name1):
        print('a function:' + func_name)
	print('a function:' + str(func_name1))          

def f3(func_name, func_name1, **kw):
    print('a function:' + func_name)
    print('a function:' + func_name1)
    print(kw)

#f = decorator(f1)
#f()	
#f1('123')
#f2('123',2)
f3('123','2', a=1, b=2, c='321')
