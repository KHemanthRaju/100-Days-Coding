class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }
        for(var c: connections){
            ans.get(c[0]).add(c[1]);
            ans.get(c[1]).add(-c[0]);
        }
        return dfs(ans, new boolean[n],0);
    }
    
    public int dfs(List<List<Integer>> ans, boolean[] visited, int from){
        int change = 0;
        visited[from] = true;
        for(var to:ans.get(from)){
            if(!visited[Math.abs(to)]){
                change += dfs(ans, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
            }
        }
        return change;
    }
}