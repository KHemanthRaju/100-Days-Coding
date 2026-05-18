class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for(int i=0;i<nums.length;i++){
            if(i > farthest){
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }
        return true;
    }
}