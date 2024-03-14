class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return i;
    }
}