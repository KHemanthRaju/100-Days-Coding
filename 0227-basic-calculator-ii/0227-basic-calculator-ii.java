class Solution {
    public int calculate(String s) {
        if(s==null ||s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> st = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        for(int i=0;i<len;i++){
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNumber = (currentNumber*10)+(currentChar-'0');
            }
            if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1){
                if(operation=='-'){
                    st.push(-currentNumber);
                }else if(operation=='+'){
                    st.push(currentNumber);
                }else if(operation=='*'){
                    st.push(st.pop()*currentNumber);
                }else if(operation=='/'){
                    st.push(st.pop()/currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
}