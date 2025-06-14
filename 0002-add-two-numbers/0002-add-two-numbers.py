# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        p1=l1
        p2=l2
        curr =dummy
        carry = 0
        while p1 or p2:
            x = p1.val if p1 else 0
            y = p2.val if p2 else 0
            sum = x + y + carry
            carry=sum//10
            curr.next = ListNode(sum%10)
            curr = curr.next
            if p1:
                p1 = p1.next
            if p2:
                p2 = p2.next
        if carry > 0:
            curr.next = ListNode(carry)
        return dummy.next