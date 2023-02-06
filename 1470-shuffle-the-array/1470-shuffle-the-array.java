class Solution {
    public int[] shuffle(int[] num, int n) {
       int ans[] = new int[2*n];
        for(int i=0,j=n,ind=0;ind<ans.length;i++,j++){
            ans[ind++]=num[i];
            ans[ind++]=num[j];
        }
        return ans;
    }
}