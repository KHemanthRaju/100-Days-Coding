class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length,n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int prefix[] = new int[n+1];
        for(int num:nums){
            prefix[i+1] = prefix[i++]+num;
        }
        i=0;
        int ans[] = new int[m];
        for(int q:queries){
            ans[i++] = binarySearch(prefix,q)-1;
        }
        return ans;
    }
    
    public int binarySearch(int[] arr, int key){
        int low=0,high=arr.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=key){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}