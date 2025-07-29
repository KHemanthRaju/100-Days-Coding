class MinStack:

    def __init__(self):
        self.stack = []

    def push(self, val: int) -> None:
        self.stack.append(val)

    def pop(self) -> None:
        self.stack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        self.temp = []
        mini = self.stack[-1]
        while self.stack:
            mini = min(mini, self.stack[-1])
            self.temp.append(self.stack.pop())
        while self.temp:
            self.stack.append(self.temp.pop())
        return mini

            


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()