class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]-(mid+1)>=k)  // arr[mid]-(mid+1)  it gives how many missing no. in the left
                high=mid-1;
            else
                low=mid+1;
        }
        return low+k;
    }
}