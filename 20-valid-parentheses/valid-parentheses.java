class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1)
            return false;
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            if (st.isEmpty())
                return false;

            if (ch == ')' && st.pop() != '(')
                return false;
            if (ch == ']' && st.pop() != '[')
                return false;
            if (ch == '}' && st.pop() != '{') {
                return false;
            }

        }
        if (st.isEmpty())
            return true;
        return false;
    }
}