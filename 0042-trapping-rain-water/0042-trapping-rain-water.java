class Solution {
    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int left = 0;
        int right= height.length-1;
        int water = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=maxLeft){
                    maxLeft = height[left];
                }else{
                    water+=maxLeft - height[left];
                }
                left++;
            }
            else{
                if(height[right]>=maxRight){
                    maxRight = height[right];
                }else{
                    water += maxRight - height[right];
                }
                right--;
            }
        }
        return water;
    }
}