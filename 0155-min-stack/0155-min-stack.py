class MinStack:

    def __init__(self):
        self.st = []

    def push(self, val: int) -> None:
        self.st.append(val)

    def pop(self) -> None:
        self.st.pop()

    def top(self) -> int:
        return self.st[-1]

    def getMin(self) -> int:
        mini = self.st[-1]
        self.temp = []
        while self.st:
            mini = min(mini, self.st[-1])
            self.temp.append(self.st.pop())
        while self.temp:
            self.st.append(self.temp.pop())
        return mini


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()