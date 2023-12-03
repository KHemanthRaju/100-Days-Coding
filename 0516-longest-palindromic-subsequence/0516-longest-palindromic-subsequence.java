class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(s,0,s.length()-1,dp);
        return ans;
    }
    
    public int helper(String s,int i,int j, int[][] dp){
        if(i>j) return dp[i][j]=0;
        if(i==j) return dp[i][j]=1;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j]=2+helper(s,i+1,j-1,dp);
        }else{
            return dp[i][j] = Math.max(helper(s,i+1,j,dp),helper(s,i,j-1,dp));
        }
    }
}