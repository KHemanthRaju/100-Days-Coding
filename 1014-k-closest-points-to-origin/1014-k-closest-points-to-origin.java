class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b)->(distance(b)-distance(a)));
        for(int[] point:points){
            maxheap.offer(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i] = maxheap.poll();
        }
        return res;
    }

    public int distance(int[] points){
        return (points[0]*points[0]) + (points[1]*points[1]);
    }
}