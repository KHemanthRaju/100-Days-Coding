class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]) return edges[0][0];
        else{
            return edges[0][1];
        }
        
        
        // int n = edges.length;
        // int[] indeg = new int[n+1];
        // int[] outdeg = new int[n+1];
        // for(int i=0;i<n;i++){
        //     int v1 = edges[i][0];
        //     int v2 = edges[i][1];
        //     outdeg[v1]++;
        //     outdeg[v2]++;
        //     indeg[v1]++;
        //     indeg[v2]++;
        // }
        // for(int i=1;i<=n;i++){
        //     if(indeg[i]==n-1 && outdeg[i]==n-1) return i;
        // }
        // return -1;
    }
}