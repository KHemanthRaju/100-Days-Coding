class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int currLength=1;
        int longestLength=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    currLength+=1;
                }else{
                    longestLength = Math.max(currLength,longestLength);
                    currLength=1;
                }
            }
        }
        return Math.max(longestLength,currLength);
    }
}