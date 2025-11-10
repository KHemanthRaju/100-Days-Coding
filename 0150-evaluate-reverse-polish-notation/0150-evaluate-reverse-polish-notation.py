class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st = []
        ans = 0
        for c in tokens:
            if c=="+":
                a = st.pop()
                b = st.pop()
                st.append(a+b)
            elif c=="*":
                st.append(st.pop()*st.pop())
            elif c=="-":
                a = st.pop()
                b = st.pop()
                st.append(b-a)
            elif c=="/":
                a = st.pop()
                b = st.pop()
                st.append(int(b/a))
            else:
                st.append(int(c))
        return st.pop()