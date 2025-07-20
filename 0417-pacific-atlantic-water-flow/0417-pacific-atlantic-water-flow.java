class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacificVisited = new boolean[rows][cols];
        boolean[][] atlanticVisited = new boolean[rows][cols];

        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();

        for(int i=0;i<rows;i++){
            pacificQueue.offer(new int[]{i,0});
            atlanticQueue.offer(new int[]{i,cols-1});
            pacificVisited[i][0] = true;
            atlanticVisited[i][cols-1] = true;
        }

        for(int i=0;i<cols;i++){
            pacificQueue.offer(new int[]{0,i});
            atlanticQueue.offer(new int[]{rows-1,i});
            pacificVisited[0][i] = true;
            atlanticVisited[rows-1][i] = true;
        }

        bfs(heights, pacificQueue, pacificVisited);
        bfs(heights, atlanticQueue, atlanticVisited);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacificVisited[i][j] && atlanticVisited[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }

    public void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited){
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int rows = heights.length;
        int cols = heights[0].length;
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];
            for(int[] dir:directions){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(0>nr || nr>=rows || 0>nc || nc>=cols || visited[nr][nc] == true){
                    continue;
                }
                if(heights[nr][nc]<heights[r][c]){
                    continue;
                }
                visited[nr][nc] = true;
                queue.offer(new int[]{nr,nc});
            }
        }
    }
}