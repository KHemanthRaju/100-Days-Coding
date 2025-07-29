class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        for i in tokens:
            if i == "+":
                st.append(st.pop()+st.pop())
            elif i == "-":
                b = st.pop()
                a = st.pop()
                st.append(a - b)
            elif i == "*":
                st.append(st.pop()*st.pop())
            elif i == "/":
                b = st.pop()
                a = st.pop()
                st.append(int(a/b))
            else:
                st.append(int(i))
        return st.pop()
            