class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] first_half = new int[n];
        int[] last_half = new int[n];

        for(int i=0;i<n-1;i++){
            first_half[i] = nums[i];
            last_half[i] = nums[i+1];
        }

        return Math.max(robpart(first_half), robpart(last_half));
    }

    public int robpart(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[nums.length+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}