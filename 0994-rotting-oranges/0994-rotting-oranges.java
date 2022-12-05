class Solution {
    public int orangesRotting(int[][] grid) {
        int oranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    oranges++;
                }
            }
        }
        if(oranges==0) return 0;
        int cnt = 0,countMin = 0;
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        while(queue.isEmpty()==false){
            int size = queue.size();
            cnt+=size;
            for(int i=0;i<size;i++){
                int[] ans = queue.poll();
                for(int j=0;j<4;j++){
                    int x = dx[j]+ans[0];
                    int y = dy[j]+ans[1];
                    if(x<0 ||y<0 || x>=rows || y>=cols || grid[x][y]==2 || grid[x][y]==0) continue;
                    grid[x][y]=2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size()!=0){
                countMin++; 
            }
        }
        return oranges == cnt?countMin:-1;
    }
}