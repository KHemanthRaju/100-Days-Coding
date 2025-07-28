class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
                
            if(!st.isEmpty()){
                if(ch==')' && st.peek()=='(' || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        
        }
        // if(!st.isEmpty()){
        //     return false;
        // }
        return st.isEmpty();
    }
}