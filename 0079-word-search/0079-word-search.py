class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS = len(board)
        COLS = len(board[0])
        def backtrack(r,c,index):
            if index == len(word):
                return True
            if r<0 or c<0 or r>=ROWS or c>=COLS or board[r][c] != word[index]:
                return False
            temp = board[r][c]
            board[r][c] = "#"
            found = (backtrack(r+1,c,index+1) or backtrack(r-1,c,index+1) or backtrack(r, c+1, index+1) or backtrack(r,c-1,index+1))
            board[r][c] = temp
            return found
            
        for i in range(ROWS):
            for j in range(COLS):
                if board[i][j] == word[0]:
                    if backtrack(i,j,0):
                        return True
        return False