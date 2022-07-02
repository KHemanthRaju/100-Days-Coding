class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int j=2;j<nums.length;j++){
            if(nums[i-1]!=nums[j]){
                i++;
                nums[i]=nums[j];
                
            }
        }
        return i+1;
    }
}