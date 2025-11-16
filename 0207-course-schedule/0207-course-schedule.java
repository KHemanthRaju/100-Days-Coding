class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            ans.add(new ArrayList<>());
        }
        int completed = 0;
        int indegree[] = new int[numCourses];
        for(int[] pre:prerequisites){
            ans.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int cool = q.poll();
            completed++;
            for(int num:ans.get(cool)){
                indegree[num]--;
                if(indegree[num]==0){
                    q.add(num);
                }
            }
        }
        return completed == numCourses;
    }
}