class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length==0){
            return 0;
        }

        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        int prev_end = points[0][1];
        int arrows = 1;
        for(int i=1;i<points.length;i++){
            int start = points[i][0];
            int end = points[i][1];
            if(start>prev_end){
                arrows++;
                prev_end = end;
            }

        }
        return arrows;
    }
}