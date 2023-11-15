class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(Character ch:s.toCharArray()){
            if(!st.empty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
            
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }
        return ans.reverse().toString();
    }
}