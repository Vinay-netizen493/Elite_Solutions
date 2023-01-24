class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if(len(nums)==0):
            return 0
        arr=sorted(nums)
        ans=1
        prev=arr[0]
        cur=1
        for i in range(1,len(arr)):
            if(arr[i]==prev+1):
                cur+=1
            elif(arr[i]!=prev):
                cur=1
            prev=arr[i]
            ans=max(ans,cur)
        return ans
        
