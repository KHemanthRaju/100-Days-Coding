class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for(int i=0;i<board.length;i++){
            dfs(board,i,0);
            dfs(board, i, cols-1);
        }

        for(int i=0;i<board[0].length;i++){
            dfs(board,0,i);
            dfs(board,rows-1,i);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='S') board[i][j]='O';
            }
        }
    }

    public void dfs(char[][] board, int r, int c){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]!='O'){
            return;
        }

        board[r][c] = 'S';
        dfs(board,r+1,c);
        dfs(board, r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
}