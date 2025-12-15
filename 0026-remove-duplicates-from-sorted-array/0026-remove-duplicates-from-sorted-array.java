class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j+=1;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}