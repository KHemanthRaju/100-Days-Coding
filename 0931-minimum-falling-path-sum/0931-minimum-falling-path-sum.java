class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix.length];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            dp[0][i] = matrix[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(j==0){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
                }else if(j==matrix.length-1){
                    dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j-1],dp[i-1][j]);
                }else{
                    dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i-1][j+1]);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(dp[matrix.length-1][i]<min){
                min = dp[matrix.length-1][i];
            }
        }
        return min;
    }
}