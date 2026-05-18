class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int farthest = 0;
        int current_end = 0;
        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i == current_end){
                jumps+=1;
                current_end = farthest;
            }
        }
        return jumps;
    }
}