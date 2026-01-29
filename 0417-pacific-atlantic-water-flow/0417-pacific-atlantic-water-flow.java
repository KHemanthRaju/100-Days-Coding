class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        Queue<int[]> atlanticQueue = new LinkedList<>();
        Queue<int[]> pacificQueue = new LinkedList<>();
        boolean[][] atlanticVisit = new boolean[rows][cols];
        boolean[][] pacificVisit = new boolean[rows][cols];
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<rows;i++){
            pacificQueue.offer(new int[]{i,0});
            atlanticQueue.offer(new int[]{i, cols-1});
            pacificVisit[i][0] = true;
            atlanticVisit[i][cols-1] = true;
        }

        for(int i=0;i<cols;i++){
            pacificQueue.offer(new int[]{0,i});
            atlanticQueue.offer(new int[]{rows-1,i});
            pacificVisit[0][i] = true;
            atlanticVisit[rows-1][i] = true;
        }
        bfs(pacificQueue, pacificVisit, heights);
        bfs(atlanticQueue, atlanticVisit, heights);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacificVisit[i][j] && atlanticVisit[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }

    public void bfs(Queue<int[]> q, boolean[][] visit, int[][] heights){
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int row = heights.length;
        int col = heights[0].length;
        while(!q.isEmpty()){
            int[] ans = q.poll();
            int r = ans[0];
            int c = ans[1];
            for(int[] dir: directions){
                int r1 = r + dir[0];
                int c1 = c + dir[1];
                if(r1<0 || r1>=heights.length || c1<0 || c1 >= heights[0].length || visit[r1][c1]==true){
                    continue;
                }
                if(heights[r1][c1] < heights[r][c]){
                    continue;
                }
                visit[r1][c1] = true;
                q.offer(new int[]{r1,c1});
            }
        }
    }
}