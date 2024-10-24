class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<numCols;j++){
                if(grid[i][j]==1){
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        
        return maxArea;
    }
    
    public int dfs(int[][] grid, int row, int col){
        
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        
        grid[row][col] = 0;
        int count = 1;
        count += dfs(grid,row+1,col);
        count += dfs(grid, row-1, col);
        count += dfs(grid, row, col+1);
        count += dfs(grid, row, col-1);
        
        return count;
    }
}