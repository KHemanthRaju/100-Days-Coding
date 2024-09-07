class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        if(rows==0){
            return 0;
        }
        int cols = grid[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    help(grid,i,j,rows,cols);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void help(char[][] grid, int x, int y, int rows, int cols){
        if(x<0 || x>=rows || y<0 || y>=cols || grid[x][y]!='1'){
            return;
        }
        grid[x][y]='2';
        help(grid,x+1,y,rows,cols);
        help(grid,x-1,y,rows,cols);
        help(grid,x,y-1,rows,cols);
        help(grid,x,y+1,rows,cols);
    }
}