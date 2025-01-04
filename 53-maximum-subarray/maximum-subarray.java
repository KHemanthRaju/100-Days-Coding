class Solution {
    public int maxSubArray(int[] nums) {
        int max_current = nums[0];
        int max_length = nums[0];

        for(int i=1;i<nums.length;i++){
            max_current = Math.max(nums[i], max_current+nums[i]);
            max_length = Math.max(max_current, max_length);
        }

        return max_length;
    }
}