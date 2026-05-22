# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        best = float('-inf')
        def dfs(root):
            nonlocal best
            if root is None:
                return 0
            left_gain = max(dfs(root.left),0)
            right_gain = max(dfs(root.right),0)
            prev_val = root.val + left_gain + right_gain
            best = max(best, prev_val)
            return root.val + max(left_gain, right_gain)
        dfs(root)
        return best