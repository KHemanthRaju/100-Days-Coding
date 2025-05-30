class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,"",0,0,n);
        return ans;
    }

    public void helper(List<String> ans,String s,int open, int closed, int n){
        if(open == n && closed == n){
            ans.add(s);
            return;
        }
        if(open<n){
            helper(ans,s+"(",open+1,closed,n);
        }
        if(closed<open){
            helper(ans,s+")",open,closed+1,n);
        }
    }

}