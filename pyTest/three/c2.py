from random import randint
from itertools import chain


chinese  = [randint(60, 100) for _ in range(10)]

math = [randint(60,100) for _ in range(10)]


count = 0
for s in chain(chinese, math):
    if s > 90:
        count += 1

print(count)