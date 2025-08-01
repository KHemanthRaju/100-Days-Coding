class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxResult = 0; 
        int l=1,r=1;
        for(int i=0;i<nums.length;i++){
            l = (l==0)?1:l;
            r = (r==0)?1:r;
            l*=nums[i];
            r*=nums[nums.length-1-i];
            maxResult = Math.max(maxResult, Math.max(l,r));
        }
        return maxResult;
    }
}