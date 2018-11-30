from random import randint

data = [randint(-10,10) for _ in range(10)]

print(data)

data1 = filter(lambda x : x >= 0, data)

print(list(data1))

data2 = [x for x in data if x >=0 ]
print(data2)