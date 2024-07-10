class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String str:logs){
            if(str.equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(str.equals("./")){
                continue;
            }else{
                st.push(str);
            }
        }
        return st.size();
    }
}