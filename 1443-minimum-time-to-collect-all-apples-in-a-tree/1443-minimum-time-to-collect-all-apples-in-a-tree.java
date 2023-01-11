class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<>();
        
        for (int i= 0; i< n; i++)
            adjacencyList.add(new ArrayList<>());//allocating the space for the vertex to store their adjacent vertex 
        
        //Creating the adjacency list from the edge list 
        for (int []edge: edges)
        {
            int u= edge[0];
            int v= edge[1];
            
            //undirected graph 
            adjacencyList.get(u).add(v);   
            adjacencyList.get(v).add(u);    
        }
        boolean visited[]= new boolean[n];
        return dfs(adjacencyList ,visited, hasApple, 0);
    }
    public int dfs (ArrayList<ArrayList<Integer>> adjacencyList, boolean visited[], List<Boolean> hasApple, int source)
    {
        visited[source]= true; 
        
        int totalTime= 0;//time possible 
        for (int vertex: adjacencyList.get(source)){//recursing down in deapth 
            if(visited[vertex] == false)//only visiting the unvisited node 
                totalTime+= dfs(adjacencyList, visited, hasApple, vertex);
        }
        
        if (source != 0 && (hasApple.get(source) || totalTime > 0))
           totalTime+= 2;
        return totalTime;
    }
}