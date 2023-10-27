class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startIndex = -1, lastIndex= -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                startIndex = i;
                break;
            }
        }
        for(int i=nums.length - 1; i>=0; i--){
            if(nums[i] == target){
                lastIndex = i;
                break;
            }
        }
        
        return new int[]{startIndex, lastIndex};
    }
}