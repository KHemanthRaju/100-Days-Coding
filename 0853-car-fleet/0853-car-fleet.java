class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] ans = new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0] = position[i];
            ans[i][1] = speed[i];
        }
        Arrays.sort(ans,(a,b)->b[0]-a[0]);
        int fleet = 1;
        double prevTime = (double)(target - ans[0][0])/ans[0][1];
        for(int i=1;i<n;i++){
            double currTime = (double)(target - ans[i][0])/ans[i][1];
            if(currTime > prevTime){
                fleet++;
                prevTime = currTime;
            }
        }
        return fleet;
    }
}