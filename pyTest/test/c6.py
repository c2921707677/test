class Solution:
    def isOneBitCharacter(self, bits):
        """
        :type bits: List[int]
        :rtype: bool
        """
        i = 0
        while i < len(bits):
            if bits[i] == 1:
                i += 1
                if i == len(bits)-1:
                    return False
            i += 1
        return True
        
s = Solution()
x = [1, 1, 0]
print(s.isOneBitCharacter(x))
