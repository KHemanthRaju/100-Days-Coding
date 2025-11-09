class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[k];
        PriorityQueue<Integer> heapq = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(int key:map.keySet()){
            heapq.add(key);
        }
        for(int i=0;i<k;i++){
            ans[i] = heapq.poll();
        }
        return ans;
    }
}