import time

def f1():
	print('a function')

def f2():
	print('b function')


def print_current_time(func):
	print(time.time())
	func()

print_current_time(f1)
print_current_time(f2)
