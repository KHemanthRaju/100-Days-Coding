class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            ans.offer(nums[i]);
            
            if(ans.size()>k){
                System.out.println(ans.poll());
            }
        }
        return ans.poll();
        
    }
}