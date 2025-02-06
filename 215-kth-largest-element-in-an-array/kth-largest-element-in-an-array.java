class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int num:nums){
            maxHeap.add(num);

            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.poll();
    }
}