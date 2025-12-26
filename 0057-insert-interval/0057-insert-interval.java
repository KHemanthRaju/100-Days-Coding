class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int[] slot:intervals){
            if(slot[1]<newInterval[0]){
                ans.add(slot);
            }else if(newInterval[1]<slot[0]){
                ans.add(newInterval);
                newInterval = slot;
            }else{
                newInterval[0] = Math.min(slot[0], newInterval[0]);
                newInterval[1] = Math.max(slot[1], newInterval[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}