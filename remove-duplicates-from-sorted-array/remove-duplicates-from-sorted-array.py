class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for j in range(len(nums)):
            if j == nums.index(nums[j]):
                nums[i] = nums[j]
                i += 1
        return i
        
        