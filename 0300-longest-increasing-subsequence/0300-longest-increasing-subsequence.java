class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int maximumSoFar = 1;
        
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
            maximumSoFar = Math.max(maximumSoFar,dp[i]);
        }
        return maximumSoFar;
    }
}