class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(Character ch: s.toCharArray()){
            if(ch == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
                continue;
            }
            st1.push(ch);
        }
        for(Character ch: t.toCharArray()){
            if(ch == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
                continue;
            }
            st2.push(ch);
        }
        return st1.equals(st2);
    }
}