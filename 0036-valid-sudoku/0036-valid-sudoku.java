class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String point = "("+board[i][j]+")";
                String row = i+point;
                String col = point+j;
                String mat = i/3+point+j/3;
                if(seen.contains(row) || seen.contains(col) || seen.contains(mat)){
                    return false;
                }
                seen.add(row);
                seen.add(col);
                seen.add(mat);
            }
        }
        return true;
    }
}