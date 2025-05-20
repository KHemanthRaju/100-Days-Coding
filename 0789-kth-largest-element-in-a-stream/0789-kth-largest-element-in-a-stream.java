class KthLargest {
    private int k;
    private Queue<Integer> heap = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i:nums){
            this.add(i);
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */