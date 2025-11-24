class Solution {
    public int maxArea(int[] height) {
        int longest = 0;
        int l = 0;
        int r = height.length-1;
        while(l<=r){
            longest = Math.max(longest,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return longest;
    }
}