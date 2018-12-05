class Solution:
    rom_dic = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }
    def romanToInt(self, s):
        rst = 0
        pre = 0
        cur = 0
        for str in s:
            #print(str)
            cur = self.rom_dic.get(str, 0)
            #print(cur)
            #print(pre)
            if (cur <= pre):
                rst = cur + rst
            else:
                rst = rst + cur - 2*pre
            pre = cur
            #print()
        return rst

		
x = 'IV'
s = Solution()

print(s.romanToInt(x))
        
