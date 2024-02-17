class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int num = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                num++;
                helper(isConnected, visited, i);
            }
        }
        return num;
    }
    
    public void helper(int[][] isConnected, boolean[] visited, int i){
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !visited[j]){
                visited[j]=true;
                helper(isConnected, visited, j);
            }
        }
    }
}