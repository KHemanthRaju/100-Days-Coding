class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        int[] ans = new int[k];
        for(int key:map.keySet()){
            minheap.add(key);
        }

        for(int i=0;i<k;i++){
            ans[i] = minheap.poll();
        }
        return ans;
    }
}