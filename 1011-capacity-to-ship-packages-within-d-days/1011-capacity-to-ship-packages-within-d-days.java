class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 50000*500;
        while(low<high){
            int mid = low + (high - low) / 2;
            if(isFeasible(weights, mid, days)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    public boolean isFeasible(int[] weights,int mid, int days){
            int curr = 0, requiredDays=1;
            for(int w:weights){
                if(w>mid){
                    return false;
                }
                if(curr + w > mid){
                    requiredDays++;
                    curr = 0;
                }
                curr += w;
            }
        return requiredDays <= days;
        }
    
    
}