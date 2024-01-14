class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
            
        }
        while(!st.isEmpty()){
            char c = st.pop();
            ans.append(c);
        }
        return ans.reverse().toString();
    }
}