class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        
        int[] total_loot_skip_last = new int[nums.length-1];
        int[] total_loot_skip_first = new int[nums.length-1];
        
        for(int i=0;i<nums.length-1;i++){
            total_loot_skip_last[i]=nums[i];
            total_loot_skip_first[i] = nums[i+1];
        }
        
        int ans1 = robHelper(total_loot_skip_last);
        int ans2 = robHelper(total_loot_skip_first);
        
        return Math.max(ans1,ans2);
        
    }
    
    public int robHelper(int[] nums){
        if(nums.length<2){
            return nums[0];
        }
        
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        
        return dp[nums.length-1];
    }
}