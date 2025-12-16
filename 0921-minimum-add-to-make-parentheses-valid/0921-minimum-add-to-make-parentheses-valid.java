class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            
            if(!st.isEmpty() && ch[i]==')' && st.peek()=='('){
                st.pop();
            }else{
                st.push(ch[i]);
            }
        }
        return st.size();
    }
}