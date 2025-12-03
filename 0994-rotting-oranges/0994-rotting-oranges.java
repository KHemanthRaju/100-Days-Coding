class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null|| grid.length == 0 || grid[0].length==0){
            return 0;
        }
        int ro = grid.length;
        int co = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<ro;i++){
            for(int j=0;j<co;j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }
            }
        }
        int time = 0;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] ans = q.poll();
            int r = ans[0], c = ans[1], t=ans[2];
            time = t;
            for(int[] d:dir){
                int row = d[0]+r;
                int col = d[1]+c;
                if(0<=row && row<grid.length && 0<=col && col<grid[0].length && grid[row][col]==1){
                    fresh--;
                    grid[row][col] = 2;
                    q.add(new int[]{row, col, t+1});
                }
            }
        }
        return fresh == 0? time : -1;
    }
}