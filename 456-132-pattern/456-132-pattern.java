class Solution {
    public boolean find132pattern(int[] nums) {
        int numsk = Integer.MIN_VALUE;
         int stackIdx = nums.length;
         for(int idx = nums.length-1;idx>=0;idx--){
             if(nums[idx]<numsk) return true;
              while(stackIdx<nums.length&&nums[idx]>nums[stackIdx]){
                 numsk = nums[stackIdx];
                 stackIdx++;
              }
             stackIdx--;
             nums[stackIdx] = nums[idx];
         }
        return false;
    }
}