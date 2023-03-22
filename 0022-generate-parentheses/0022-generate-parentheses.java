class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        helper(list,"",0,0,n);
        return list;
    }
    public void helper(ArrayList<String> ans, String p, int open, int close, int n){
        if(open==n && close==n){
            ans.add(p);
            return;
        }
        if(open<n){
            helper(ans,p+"(",open+1,close,n);
        }
        if(close<open){
            helper(ans,p+")",open, close+1, n);
        }
    }
}