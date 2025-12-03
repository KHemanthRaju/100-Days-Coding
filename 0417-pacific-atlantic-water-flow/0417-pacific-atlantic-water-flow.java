class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        boolean[][] pacificVisited = new boolean[rows][cols];
        boolean[][] atlanticVisited = new boolean[rows][cols];
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<rows;i++){
            pacificQueue.offer(new int[]{i,0});
            atlanticQueue.offer(new int[]{i, cols-1});
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
        for(int i=0;i<rows; i++){
            for(int j=0;j<cols;j++){
                if(atlanticVisited[i][j] && pacificVisited[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }

    public void bfs(int[][] heights, Queue<int[]> q, boolean[][] visited){
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int row = heights.length;
        int col = heights[0].length;
        while(!q.isEmpty()){
            int[] ans = q.poll();
            int r = ans[0], c = ans[1];
            for(int[] dir:directions){
                int r1 = dir[0]+r;
                int c1 = dir[1] + c;
                if(0>r1 || r1>=heights.length || 0>c1 || c1 >= heights[0].length || visited[r1][c1]==true){
                    continue;
                }
                if(heights[r1][c1]<heights[r][c]){
                    continue;
                }
                visited[r1][c1] = true;
                q.offer(new int[]{r1,c1});
            }
        }
    }
}