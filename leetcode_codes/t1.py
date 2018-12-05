class Solution:
    def twoSum(self, nums, target):
        temp = dict()
        for i in range(0, len(nums)):
            rst = target - nums[i]
            if rst in temp:
                return [temp[rst], i]
            else:
                temp[nums[i]] = i

s = Solution()
nums = [2,7,11,15]
target = 9
test = s.twoSum(nums, target)
print(test)



