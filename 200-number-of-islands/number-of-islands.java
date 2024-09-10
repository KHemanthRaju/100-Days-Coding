class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        
        int numRows = grid.length;
        int numCols = grid[0].length;
        int isLandsCount = 0;
        
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                if(grid[i][j] == '1'){
                    isLandsCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return isLandsCount;
    }
    
    public void dfs(char[][] grid, int row, int col){
        int numRows = grid.length;
        int numCols = grid[0].length;
        
        if(row<0 || row>=numRows || col<0 || col>=numCols || grid[row][col]=='0'){
            return;
        }
        
        grid[row][col] = '0';
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
}