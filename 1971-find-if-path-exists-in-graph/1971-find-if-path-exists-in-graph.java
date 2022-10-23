class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        boolean[] visited = new boolean[n];
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        dfs(graph,source,destination,visited);
        return found;
    }
    
    public void dfs(HashMap<Integer,List<Integer>> graph,int source, int des,boolean[] visited){
        if(visited[source] || found) return;
        visited[source] = true;
        for(int neigh : graph.get(source)){
            if(neigh == des){
                found = true;
                break;
            }
            if(!visited[neigh]){
                dfs(graph,neigh,des,visited);
            }
        }
        
    }
}