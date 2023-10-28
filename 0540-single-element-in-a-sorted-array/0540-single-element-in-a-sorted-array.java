class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isFeasible(nums,mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return nums[res];
    }
    
    public boolean isFeasible(int[] nums, int mid){
        if(mid == nums.length-1){
            return true;
        }else if(mid % 2 == 1){
            return nums[mid] != nums[mid-1];
        }else{
            return nums[mid] != nums[mid+1];
        }
    }
}