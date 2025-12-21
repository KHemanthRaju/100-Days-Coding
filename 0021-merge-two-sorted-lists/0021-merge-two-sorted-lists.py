# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        l1 = list1
        l2 = list2
        head = ListNode(0)
        dummy = head
        if l1==None and l2==None:
            return None
        if l1==None:
            return l2
        if l2 == None:
            return l1
        while l1 and l2:
            if l1.val < l2.val:
                dummy.next = l1
                l1 = l1.next
            else:
                dummy.next = l2
                l2 = l2.next
            dummy = dummy.next
        if l1!=None:
            dummy.next = l1
            l1 = l1.next
        if l2!=None:
            dummy.next = l2
            l2 = l2.next
        return head.next