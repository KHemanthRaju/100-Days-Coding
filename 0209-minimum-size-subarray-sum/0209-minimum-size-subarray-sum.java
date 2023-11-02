class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0, p2 = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(p2<nums.length){
            sum+=nums[p2];
            while(sum>=target){
                ans = Math.min(ans,p2-p1+1);
                sum-=nums[p1];
                p1++;
            }
            p2++;
        }
        return (ans!=Integer.MAX_VALUE)?ans:0;
    }
}