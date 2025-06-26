class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()){
            if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
                st.pop();
            }else{
                st.push(ch);
            }
            }
            else{
                st.push(ch);
            }
            
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}