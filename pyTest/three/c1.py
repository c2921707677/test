from itertools import islice


f = open('/var/log/alternatives.log')

lines = f.readlines()

f.seek(0)
# for line in f:
#     print(line)


for line in islice(f, 5):
    print(line)