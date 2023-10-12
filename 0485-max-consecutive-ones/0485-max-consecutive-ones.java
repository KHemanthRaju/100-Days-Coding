class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 0;
                
            }
        }
        return Math.max(count,max);
    }
}