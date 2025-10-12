class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ans.add(new ArrayList<>());
        }
        int completed = 0;
        int[] indegree = new int[numCourses];
        for(int[] prev:prerequisites){
            ans.get(prev[1]).add(prev[0]);
            indegree[prev[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int cool = queue.poll();
            completed++;
            for(int item:ans.get(cool)){
                indegree[item]--;
                if(indegree[item]==0){
                    queue.offer(item);
                }
            }
        }
        return completed ==numCourses;
        
    }
}