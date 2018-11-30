def test(test1, test2):
    test1 = test1
    test2 = test2
    return test1,test2

tests = test(1,2)
print(tests[0], tests[1])

tests = test(1,'a')
print(tests[0], tests[1]) 

