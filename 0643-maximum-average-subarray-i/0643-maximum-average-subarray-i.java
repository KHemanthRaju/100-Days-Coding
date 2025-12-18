class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window_sum = 0;
        for(int i=0;i<k;i++){
            window_sum += nums[i];
        }
        int max_sum = window_sum;
        int startIndex = 0;
        int endIndex=k;
        while(endIndex<nums.length){
            window_sum -= nums[startIndex];
            startIndex++;

            window_sum += nums[endIndex];
            endIndex++;

            max_sum = Math.max(max_sum, window_sum);
        }
        return (double)max_sum/k;

    }
}