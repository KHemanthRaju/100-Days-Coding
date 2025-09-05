class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count = 0
        j = 0
        for i in range(len(nums)):
            if nums[i] ==0:
                count+=1
            else:
                nums[j] = nums[i]
                j+=1
        while count!=0:
            nums[j]=0
            j+=1
            count-=1
        