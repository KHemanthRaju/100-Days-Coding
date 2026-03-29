class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        for token in tokens:
            if token == "+":
                st.append(st.pop()+st.pop())
            elif token == "*":
                st.append(st.pop()*st.pop())
            elif token == "-":
                a = st.pop()
                b = st.pop()
                st.append(b-a)
            elif token == "/":
                a = st.pop()
                b = st.pop()
                st.append(int(b/a))
            else:
                st.append(int(token))
        return st.pop()