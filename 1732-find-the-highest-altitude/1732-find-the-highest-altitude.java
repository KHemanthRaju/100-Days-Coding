class Solution {
    public int largestAltitude(int[] gain) {
        int ans[] = new int[gain.length+1];
        ans[0] = 0;
        int j=1;
        for(int i=0;i<gain.length;i++){
            ans[j] = ans[i]+gain[i];
            j++;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            max = Math.max(max,ans[i]);
        }
        return max;
    }
}