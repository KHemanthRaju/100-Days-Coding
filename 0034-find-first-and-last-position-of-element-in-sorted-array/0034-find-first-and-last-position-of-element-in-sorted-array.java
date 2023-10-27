class Solution {
    public int[] searchRange(int[] nums, int target) {
        // if(nums.length == 1 && target == 1){
        //     return new int[]{0,0};
        // }
        int startIndex = -1, lastIndex= -1;
        //int ans[] = new int[2];
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
        //ans[0] = startIndex;
        return new int[]{startIndex, lastIndex};
    }
}