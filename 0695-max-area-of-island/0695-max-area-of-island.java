class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    count = Math.max(dfs(grid, i, j),count);
                }
            }

        }
        return count;
    }

    public int dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        int count = 1;
        grid[i][j] = 0;
        count += dfs(grid, i-1, j);
        count += dfs(grid, i+1, j);
        count += dfs(grid, i, j-1);
        count += dfs(grid, i, j+1);
        return count;
    }

}