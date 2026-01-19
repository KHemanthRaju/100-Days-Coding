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
        while l1!=None and l2!=None:
            if l1.val<l2.val:
                ans.next = l1
                l1 = l1.next
            else:
                ans.next = l2
                l2 = l2.next
            ans = ans.next
        while l1!=None:
            ans.next = l1
            ans=ans.next
            l1 = l1.next
        while l2!=None:
            ans.next = l2
            ans = ans.next
            l2 = l2.next
        return head.next