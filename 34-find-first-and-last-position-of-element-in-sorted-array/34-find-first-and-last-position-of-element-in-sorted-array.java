class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);
        return ans;
    }
    public int findFirst(int[] nums,int target){
        int idx=-1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
    
    public int findLast(int[] nums,int target){
        int idx=-1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
    }
}