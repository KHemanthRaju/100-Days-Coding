class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int lo = 0, high = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[lo]) >= Math.abs(nums[high])){
                ans[i] = nums[lo]*nums[lo];
                lo++;
            }else{
                ans[i] = nums[high]*nums[high];
                high--;
            }
        }
        return ans;
    }
}