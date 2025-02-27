class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charst = new Stack<>();
        Stack<Integer> countst = new Stack<>();
        
        for(char c:s.toCharArray()){
            if(!charst.isEmpty() && charst.peek()==c){
                countst.push(countst.peek()+1);
            }
            else countst.push(1);
            charst.push(c);
            if(countst.peek()==k){
                for(int i=0;i<k;i++){
                    countst.pop();
                    charst.pop();
                }
            }
        }
        StringBuilder st = new StringBuilder();
        while(charst.size()>0){
            st.append(charst.pop());
        }
        return st.reverse().toString();
    }
}