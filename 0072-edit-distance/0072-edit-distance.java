class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(word1,word2,word1.length(),word2.length(),dp);
        return ans;
    }
    
    public int helper(String s1, String s2, int n, int m, int[][] dp){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m] = helper(s1,s2,n-1,m-1,dp);
        }else{
            int replace = helper(s1,s2,n-1,m-1,dp);
            int insert = helper(s1,s2,n-1,m,dp);
            int delete = helper(s1,s2,n,m-1,dp);
            return dp[n][m] = Math.min(replace,Math.min(insert,delete))+1;
        }
        
    }
}