class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            if(st.isEmpty()) return false;
            if(ch == ')' && st.pop()!='(') return false;
            if(ch==']' && st.pop()!='[') return false;
            if(ch=='}' && st.pop()!='{') return false;
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}