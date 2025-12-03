class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans = new ArrayList<>();
        int completed = 0;
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            ans.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            ans.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int a = q.poll();
            completed++;
            for(int num:ans.get(a)){
                indegree[num]--;
                if(indegree[num]==0){
                    q.offer(num);
                }
            }

        }
        return completed == numCourses?true:false;
    }
}