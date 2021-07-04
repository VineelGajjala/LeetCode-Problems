class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        toReturn = 0
        for e in (nums):
            if len(str(e))%2 == 0:
                toReturn += 1
            
        return toReturn