class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length;
        while(high > low + 1){
            int mid = low + (high - low)/2;
            if(ok(arr,mid)){
                low = mid;
            }else{
                high = mid;
            }
        }
        return low;
    }
    
    public boolean ok(int[] A, int i){
        return A[i]-A[i-1] > 0;
    }
}