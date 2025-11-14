class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            if(ans.size()>k){
                ans.poll();
            }
        }
        return ans.poll();
    }
}