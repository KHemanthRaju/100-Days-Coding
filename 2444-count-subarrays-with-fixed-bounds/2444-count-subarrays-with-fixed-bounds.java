class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
            
        int min=-1, max=-1, left = -1;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i]<minK || nums[i] > maxK) {
                left = min = max = i;
            } 
            min = nums[i]==minK ? i : min;
            max = nums[i]==maxK ? i : max;
            res += Math.min(max, min)-left;  
        }
        return res;
    }
}