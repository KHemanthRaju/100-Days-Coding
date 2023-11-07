class NumArray {
    int prefix[];

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prefix[i] = nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum += prefix[i];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */