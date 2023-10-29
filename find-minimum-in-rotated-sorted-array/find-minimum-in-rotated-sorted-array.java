class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(feasible(nums,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return nums[low];
    }
    
    public boolean feasible(int[] nums, int i){
        return nums[i]<nums[nums.length-1];
    }
}