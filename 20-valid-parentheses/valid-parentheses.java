class Solution {
    public boolean isValid(String s) {
        if(s.length()==0){
            return false;
        }

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            if(st.isEmpty()) return false;
            if(ch==')' && st.pop()!='(') return false;
            if(ch==']' && st.pop()!='[') return false;
            if(ch=='}' && st.pop() != '{') return false;

        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}