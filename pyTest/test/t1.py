# coding=utf-8 
class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0,len(nums) - 1):
			if int(nums[i+1]) == target - int(nums[i]):
				print('第' + i + '次' + nums[i] + ',' + nums[i+1])
				return [i, i+1]
			else:
				print('第' + str(i) + '次' + nums[i] + ',' + nums[i+1])
				return [i, i+1]
				return None
			
        return 0
			
		
		
        """
        i = 0
        while i < len(nums):
            if i == len(nums) - 1:
                return "No solution here!"
            r = target - nums[i]
			# Can't use a num twice
            num_follow = nums[i + 1:]
            if r in num_follow:
                return [i, num_follow.index(r) + i + 1]
            i = i + 1"""
		

nums = [2, 7, 11, 15]
target = 18
solution = Solution()
test = solution.twoSum(nums, target)
if test is None:
	print('error')
else:
    print(str(nums[test[0]] + nums[test[1]]))