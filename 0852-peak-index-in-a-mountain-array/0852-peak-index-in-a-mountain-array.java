class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length-1;
        while(high > low){
            int mid = low + (high - low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
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