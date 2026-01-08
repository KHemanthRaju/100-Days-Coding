class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        for c in tokens:
            if c=="+":
                a = st.pop()
                b = st.pop()
                st.append(a+b)
            elif c=="-":
                a = st.pop()
                b = st.pop()
                st.append(b-a)
            elif c == "*":
                st.append(st.pop()*st.pop())
            elif c=="/":
                a = st.pop()
                b = st.pop()
                st.append(int(b/a))
            else:
                st.append(int(c))
        return st.pop()