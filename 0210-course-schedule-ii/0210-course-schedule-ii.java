class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] pre:prerequisites){
            graph.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }

        int[] res = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int index = 0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            res[index++] = x;

            for(int y:graph.get(x)){
                indegree[y]--;
                if(indegree[y]==0){
                    queue.offer(y);
                }
            }
        }
        return index == numCourses ? res : new int[0];
    }
}