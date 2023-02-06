class Solution {
    public int[] shuffle(int[] num, int n) {
        int arr1[] = new int[n+1];
        int arr2[] = new int[n+1];
        for(int i=0;i<n;i++){
            arr1[i]=num[i];
        }
        int j=0;
        for(int i=n;i<2*n;i++){
            arr2[j]=num[i];
            j++;
        }
        int k=0;
        int ans[] = new int[2*n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(arr1[i]);
            st.push(arr2[i]);
        }
        for(int i=2*n-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}