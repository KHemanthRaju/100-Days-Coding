class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] total_loot_skip_first = new int[n];
        int[] total_loot_skip_last = new int[n];
        
        for(int i=0;i<n-1;i++){
            total_loot_skip_first[i] = nums[i];
            total_loot_skip_last[i] = nums[i+1];
        }
        
        return Math.max(robhelper(total_loot_skip_first), robhelper(total_loot_skip_last));
    }
    
    public int robhelper(int[] nums){
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}