class Solution {
    public int maxSubArray(int[] nums) {
        
        int curr_sum = nums[0];
        int max_so_far = nums[0];
        
        for(int i=1;i<nums.length;i++){
            curr_sum = Math.max(nums[i], curr_sum+nums[i]);
            max_so_far = Math.max(max_so_far, curr_sum);
        }
        
        return max_so_far;
    }
}