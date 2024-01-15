class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] won = new int[100001];
        int[] loss = new int[100001];
        for(int[] match:matches){
            won[match[0]]++;
            loss[match[1]]++;
        }
        
        List<Integer> wonAllMatches = new ArrayList<>();
        List<Integer> lossOneMatch = new ArrayList<>();
        for(int i=0;i<won.length;i++){
            if(won[i]>0 && loss[i]==0){
                wonAllMatches.add(i);
            }
            if(loss[i] == 1){
                lossOneMatch.add(i);
            }
        }
        
        ans.add(wonAllMatches);
        ans.add(lossOneMatch);
        
        return ans;
     }
}