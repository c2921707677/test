import re

s = 'ABC3425D92'

def convert(value):
	matched = value.group()
	if matched >= '6':
		return '9'
	else:
		return '0'

r = re.sub('\d', convert, s)

r1 = re.match('\w{3}', s)

print(r1.group())

print(r)
