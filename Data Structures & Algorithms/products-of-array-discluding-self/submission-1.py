class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = []
        suffix = [0]*len(nums)
        for i in range(len(nums)):
            if i == 0:
                prefix.append(1)
                continue
            prefix.append(prefix[i-1] * nums[i-1])
        
        for i in range(len(nums)-1, -1, -1):
            if i == len(nums)-1:
                suffix[i] = 1
                continue
            suffix[i] = suffix[i+1] * nums[i+1]
        result = [i*j for (i,j) in list(zip(suffix, prefix))]
        return result