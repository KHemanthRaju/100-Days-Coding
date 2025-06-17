class Solution {
    public boolean isPalindrome(int x) {
        String st = Integer.toString(x);
        if(st==null){
            return false;
        }
        char[] ans = st.toCharArray();
        int i=0;
        int j = ans.length-1;
        while(i<j){
            if(ans[i]!=ans[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}