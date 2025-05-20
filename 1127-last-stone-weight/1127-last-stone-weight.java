class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> minheap = new PriorityQueue<>((a,b)->b-a);
        for(int i:stones){
            minheap.add(i);
        }
        while(minheap.size()>1){
            minheap.offer(minheap.poll()-minheap.poll());
        }
        return minheap.poll();
    }
}