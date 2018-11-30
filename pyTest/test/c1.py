class Solution:
    def twoSum(self, nums, target):
        
        for i in range(0, len(nums)-1):
            rst = target - nums[i]
            if (rst in nums) and (nums.index(rst) != i):
                return [i, nums.index(rst)]
        return None

s = Solution()
nums = [3, 2, 3]
print(nums.index(3))
target = 6
test = s.twoSum(nums, target)
print(test)



