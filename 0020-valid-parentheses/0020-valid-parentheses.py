class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if stack:
                if ch == ')' and stack[-1]=='(':
                    stack.pop()
                elif ch=='}' and stack[-1]=='{':
                    stack.pop()
                elif ch==']' and stack[-1]=='[':
                    stack.pop()
                else:
                    stack.append(ch)
            else:
                stack.append(ch)
        if stack:
            return False
        return True