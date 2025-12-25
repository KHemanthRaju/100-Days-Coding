class KthLargest {
    private int k;
    PriorityQueue<Integer> ans = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i:nums){
            this.add(i);
        }
    }
    
    public int add(int val) {
        ans.add(val);
        if(ans.size()>k){
            ans.poll();
        }
        return ans.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */