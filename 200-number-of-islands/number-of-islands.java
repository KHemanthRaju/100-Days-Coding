class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length==0){
            return 0;
        }
        
        int gridRows = grid.length;
        int gridCols = grid[0].length;
        int numIslands = 0;
        
        for(int i=0;i<gridRows;i++){
            for(int j=0;j<gridCols;j++){
                if(grid[i][j] == '1'){
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }
    
    public void dfs(char[][] grid, int i, int j){
        int gridRows = grid.length;
        int gridCols = grid[0].length;
        
        if(i<0 || i>=gridRows || j<0 || j>=gridCols || grid[i][j]=='0'){
            return;
        }
        
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}