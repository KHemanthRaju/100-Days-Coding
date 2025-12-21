# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        sum1 = 0
        p1 = l1
        p2 = l2
        dummy = ListNode(0)
        curr = dummy
        while p1 or p2:
            x = p1.val if p1 else 0
            y = p2.val if p2 else 0
            sum1 = x+y+carry
            carry = sum1//10
            curr.next = ListNode(sum1%10)
            curr = curr.next
            if p1:
                p1 = p1.next
            if p2:
                p2 = p2.next
        if carry:
            curr.next = ListNode(carry)
        return dummy.next