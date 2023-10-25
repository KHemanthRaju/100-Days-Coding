class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0, high = (int)1e6;
        while(low<high){
            int mid = low + (high - low)/2;
            
            if(ok(nums, mid, threshold)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    
    public boolean ok(int[] nums, int mid, int threshold){
        int res = 0;
        for(int num:nums){
            if(mid == 0){
                return false;
            }
            res += (num + mid - 1) / mid;
        }
        return res <= threshold;
    }
}