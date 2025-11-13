class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        l,r = 0, ROWS*COLS-1
        while l<=r:
            m = l + (r-l)//2
            row,col = m//COLS, m%COLS
            if target > matrix[row][col]:
                l = m + 1
            elif target < matrix[row][col]:
                r = m - 1
            else:
                return True
        return False