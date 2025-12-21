class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }
            }
        }
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int ans[] = q.poll();
            int r = ans[0], c = ans[1], t = ans[2];
            time = t;
            for(int[] dir:directions){
                int row = r + dir[0];
                int col = c + dir[1];
                if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1){
                    fresh--;
                    grid[row][col]=2;
                    q.offer(new int[]{row,col,t+1});
                }
            }
        }
        return fresh==0?time:-1;
    }
}