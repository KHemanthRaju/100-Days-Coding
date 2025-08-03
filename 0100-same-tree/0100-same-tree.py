# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
"""
Understand - Input - 2 trees, Output - boolean,  edge cases - 2 trees are empty-return true, 1 tree is empty, another tree has node - return false

Plan - root1 and root2 is null, iterative, queue - [p.val, q.val] , if p.val==q.val, p.val != q.val, return false, [p.left, q.left], [p.right, q.right]
"""

from collections import deque
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        queue = deque([(p,q)])

        while queue:
            node1, node2 = queue.popleft()

            if not node1 and not node2:
                continue

            if not node1 or not node2 or node1.val != node2.val:
                return False
            
            queue.append((node1.left, node2.left))
            queue.append((node1.right, node2.right))
        
        return True
        