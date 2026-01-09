class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int fleet = 1;
        int[][] pair = new int[n][2];
        for(int i=0;i<position.length;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b)->b[0]-a[0]);
        double prevTime = (double)(target - pair[0][0])/pair[0][1];
        for(int i=1;i<n;i++){
            double currTime = (double)(target - pair[i][0])/pair[i][1];
            if(currTime>prevTime){
                fleet++;
                prevTime = currTime;
            }
        }
        return fleet;
    }
}