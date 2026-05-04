class MedianFinder {
    private PriorityQueue<Integer> left_max_heap;
    private PriorityQueue<Integer> right_min_heap;

    public MedianFinder() {
        left_max_heap = new PriorityQueue<>(Collections.reverseOrder());
        right_min_heap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (left_max_heap.isEmpty() || num < left_max_heap.peek()) {
            left_max_heap.add(num);
        } else {
            right_min_heap.add(num);
        }
        if (left_max_heap.size() > right_min_heap.size() + 1) {
            right_min_heap.add(left_max_heap.poll());
        } else if (left_max_heap.size() < right_min_heap.size()) {
            left_max_heap.add(right_min_heap.poll());
        }
    }
    
    public double findMedian() {
        if(left_max_heap.size() == right_min_heap.size()){
            return (double)(left_max_heap.peek() + right_min_heap.peek()) / 2.0;
        }
        return (double)left_max_heap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */