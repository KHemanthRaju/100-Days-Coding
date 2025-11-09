class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                String st = "("+board[i][j]+")";
                if(!seen.add(i+st)||!seen.add(st+j)||!seen.add(i/3+st+j/3)) return false;
            }
        }
        return true;
    }
}