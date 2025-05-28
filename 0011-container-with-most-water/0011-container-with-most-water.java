class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        while(left <= right){
            minVal = Math.min(height[left],height[right]);
            maxVal = Math.max(maxVal,minVal * (right - left));
            if(left<right){
                left++;
            }else{
                right--;
            }
        }
        return maxVal;
    }
}