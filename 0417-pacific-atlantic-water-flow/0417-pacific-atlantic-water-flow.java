class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        for(int i=0;i<rows;i++){
            pacificQueue.offer(new int[]{i,0});
            atlanticQueue.offer(new int[]{i, cols-1});
            pacific[i][0] = true;
            atlantic[i][cols-1] = true;

        }

        for(int i=0;i<cols;i++){
            pacificQueue.offer(new int[]{0,i});
            atlanticQueue.offer(new int[]{rows-1, i});
            pacific[0][i] = true;
            atlantic[rows-1][i] = true;

        }

        bfs(heights, pacificQueue, pacific);
        bfs(heights, atlanticQueue, atlantic);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }

    public void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited){
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int rows = heights.length, cols = heights[0].length;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            for (int[] d : directions) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || visited[nr][nc]) continue;
                if (heights[nr][nc] < heights[r][c]) continue;
                visited[nr][nc] = true;
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}