# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        diameter = 0
        def height(root:Optional[TreeNode]) -> int:
            nonlocal diameter
            if not root:
                return 0
            left = height(root.left)
            right = height(root.right)
            diameter = max(diameter, left+right)
            return 1+max(left, right)

        height(root)
        return diameter
    
    