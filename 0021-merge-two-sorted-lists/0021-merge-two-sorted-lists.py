# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        l1 = list1
        l2 = list2
        ans = ListNode(0)
        head = ans
        while l1 and l2:
            if l1.val <= l2.val:
                ans.next = l1
                l1 = l1.next
            elif l1.val > l2.val:
                ans.next = l2
                l2 = l2.next
            ans = ans.next
        while l1:
            ans.next = l1
            l1 = l1.next
            ans = ans.next
        while l2:
            ans.next = l2
            l2 = l2.next
            ans = ans.next
        return head.next