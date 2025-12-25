class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> ans = new PriorityQueue<>((a,b)->distance(b)-distance(a));
        int[][] cool = new int[k][2];
        for(int point[]:points){
            ans.add(point);
            if(ans.size()>k){
                ans.poll();
            }
        }
        for(int i=0;i<k;i++){
            cool[i] = ans.poll();
        }
        return cool;
    }

    public int distance(int[] point){
        return (point[0]*point[0]) + (point[1]*point[1]);
    }
}