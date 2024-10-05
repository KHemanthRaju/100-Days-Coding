class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;
        
        reverse(nums, 0, size-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, size-1);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}