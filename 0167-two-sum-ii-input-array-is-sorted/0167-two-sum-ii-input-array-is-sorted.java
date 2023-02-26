class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int ans[] = new int[2];
        while(low<high){
            if(target-numbers[low]==numbers[high]){
                ans[0] = low+1;
                ans[1] = high+1;
                return ans;
            }else if(target-numbers[low]<numbers[high]){
                high--;
            }else{
                low++;
            }
        }
        int res[]= {-1,-1};
        return res;
    }
}