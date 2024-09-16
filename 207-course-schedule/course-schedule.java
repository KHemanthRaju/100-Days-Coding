class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //using bfs
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            map.put(i, new ArrayList<>());
        }
        
        int[] indegree = new int[numCourses];
        
        for(int[] data: prerequisites){
            int u = data[0];
            int v = data[1];
            map.get(v).add(u);
            indegree[u]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses; i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        
        int processedCourses=0;
        while(!q.isEmpty()){
            int course = q.poll();
            processedCourses++;
            
            for (int neighbor : map.get(course)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }
        
        return processedCourses == numCourses;
    }
}