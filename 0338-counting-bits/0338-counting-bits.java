class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i] = 1+ans[i & (i-1)];
        }
        return ans;
    }
}