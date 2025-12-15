class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String str = "("+board[i][j]+")";
                String rowCheck = i+str;
                String colCheck = str+j;
                String boxCheck = i/3+str+j/3;
                if(seen.contains(rowCheck) || seen.contains(colCheck) || seen.contains(boxCheck)){
                    return false;
                }
                seen.add(rowCheck);
                seen.add(colCheck);
                seen.add(boxCheck);
            }
        }
        return true;
    }
}