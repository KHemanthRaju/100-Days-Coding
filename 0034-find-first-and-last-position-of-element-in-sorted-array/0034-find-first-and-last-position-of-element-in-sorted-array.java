class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = leftBinarySearch(nums,target);
        ans[1] = rightBinarySearch(nums,target);
        return ans;
    }
    
    public int leftBinarySearch(int[] nums, int target){
        int res = -1;
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
    
    public int rightBinarySearch(int[] nums, int target){
        int res = -1;
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
}