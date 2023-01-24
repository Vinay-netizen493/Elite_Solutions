class Solution(object):
    def threeSum(self, nums):
        result = []
        nums.sort()
        
        for current, num in enumerate(nums):
            left = current + 1
            right = len(nums) - 1
            
            if current > 0 and num == nums[current - 1]:
                continue
            
            while left < right:
                sumValue = num + nums[left] + nums[right]
                
                if sumValue == 0:
                    result.append((num, nums[left], nums[right]))
                    
                if sumValue > 0:
                    right -= 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1 
                else:
                    left += 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1 
                
        
        return result
