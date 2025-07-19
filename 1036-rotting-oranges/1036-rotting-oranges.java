class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j,0});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int time = 0;
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] q = queue.poll();
            int r = q[0], c = q[1], t = q[2];
            time = t;
            for(int[] dire:dir){
                int nr = r + dire[0];
                int nc = c + dire[1];
                if(0<=nr && nr<grid.length && 0<=nc && nc<grid[0].length && grid[nr][nc] == 1){
                    fresh--;
                    grid[nr][nc] = 2;
                    queue.offer(new int[]{nr,nc,t+1});
                }
            }
        }
        return fresh == 0 ? time : -1;
    }
}