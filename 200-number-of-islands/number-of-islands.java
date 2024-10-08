class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        
        int numRows = grid.length;
        int numCols = grid[0].length;
        int numOfIslands = 0;
        
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                if(grid[i][j]=='1'){
                    numOfIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }
    
    public void dfs(char[][] grid, int rows, int cols){
        if(rows<0 || rows>=grid.length || cols<0 || cols>=grid[0].length || grid[rows][cols]=='0'){
            return;
        }
        
        grid[rows][cols]='0';
        dfs(grid, rows+1, cols);
        dfs(grid, rows-1, cols);
        dfs(grid, rows, cols+1);
        dfs(grid, rows, cols-1);
    }
}