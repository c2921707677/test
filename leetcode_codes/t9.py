class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        #print(x)
        y = str(x)[::-1]
        #print(y)
        if str(x) == y:
            return True
        return False
        
s = Solution()
x = 121
flag = s.isPalindrome(x)
print(flag)

