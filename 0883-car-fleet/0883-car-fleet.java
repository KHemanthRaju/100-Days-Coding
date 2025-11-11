class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs,(a,b)->b[0]-a[0]);
        double prevTime = (double)(target - pairs[0][0])/pairs[0][1];
        int fleets = 1;
        for(int i=1;i<n;i++){
            double currTime = (double)(target - pairs[i][0])/pairs[i][1];
            if(currTime > prevTime){
                fleets++;
                prevTime = currTime;
            }
        }
        return fleets;
    }
}