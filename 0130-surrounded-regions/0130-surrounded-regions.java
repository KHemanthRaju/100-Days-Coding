class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Step 1: Traverse the border
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);           // first column
            dfs(board, i, cols - 1);    // last column
        }
        for (int j = 0; j < cols; j++) {
            dfs(board, 0, j);           // first row
            dfs(board, rows - 1, j);    // last row
        }

        // Step 2: Replace
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';  // Surrounded regions
                if (board[i][j] == 'S') board[i][j] = 'O';  // Safe regions
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != 'O') {
            return;
        }

        board[r][c] = 'S'; // Mark safe
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}