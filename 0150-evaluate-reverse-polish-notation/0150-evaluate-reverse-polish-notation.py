class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for s in tokens:
            if s=="+":
                stack.append(stack.pop()+stack.pop())
            elif s=="-":
                b = stack.pop()
                a = stack.pop()
                stack.append(a-b)
            elif s=="*":
                stack.append(stack.pop()*stack.pop())
            elif s=="/":
                b = stack.pop()
                a = stack.pop()
                stack.append(int(a/b))
            else:
                stack.append(int(s))
        return stack.pop()