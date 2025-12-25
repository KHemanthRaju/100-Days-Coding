class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> ans = new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int[] point:points){
            ans.offer(point);
            if(ans.size()>k){
                ans.poll();
            }
        }
        int[][] cool = new int[k][2];
        for(int i=0;i<k;i++){
            cool[i] = ans.poll();
        }
        return cool;

    }
    public int distance(int[] x){
        return (x[0]*x[0]) + (x[1]*x[1]);
    }
}