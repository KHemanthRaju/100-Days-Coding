class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        for ch in s:
            if st:
                if ch == ')' and st[-1]=='(':
                    st.pop()
                elif ch == ']' and st[-1]=='[':
                    st.pop()
                elif ch == '}' and st[-1]=='{':
                    st.pop()
                else:
                    st.append(ch)
            else:
                st.append(ch)
        if st:
            return False
        return True