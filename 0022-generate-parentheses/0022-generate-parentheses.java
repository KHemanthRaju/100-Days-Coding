class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }

    public void helper(List<String> ans, String str1, int open, int close, int n){
        if(open == n && close == n){
            ans.add(str1);
        }
        if(open<n){
            helper(ans, str1+"(", open+1, close, n);
        }
        if(close<open){
            helper(ans, str1+")", open, close+1, n);
        }
    }
}