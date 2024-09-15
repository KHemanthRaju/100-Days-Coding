class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int n = isConnected.length;
        for(int i=0;i<n;i++){
            map.put(i, new ArrayList<>());
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        
        Set<Integer> visited = new HashSet<>();
        int count=0;
        
        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(i, map, visited);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int i, Map<Integer, List<Integer>> map, Set<Integer> visited){
        Stack<Integer> st = new Stack<>();
        st.push(i);
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visited.contains(curr)){
                visited.add(curr);
                for(int neighbor:map.get(curr)){
                    dfs(neighbor,map,visited);
                }
            }
        }
    }
}