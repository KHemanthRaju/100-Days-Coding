class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            maxheap.add(nums[i]);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        return maxheap.poll();
    }
}