class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> ans = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<stones.length;i++){
            ans.add(stones[i]);
        }
        while(ans.size()>1){
            ans.add(ans.poll()-ans.poll());
        }
        return ans.size()==0?0:ans.poll();
    }
}