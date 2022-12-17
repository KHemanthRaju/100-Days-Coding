class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int a,b;
        for(String s : tokens){
            if(s.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(s.equals("-")){
                b=st.pop();
                a = st.pop();
                st.push(a-b);
            }else if(s.equals("/")){
                b = st.pop();
                a = st.pop();
                st.push(a/b);
            }else if(s.equals("*")){
                st.push(st.pop()*st.pop());
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}