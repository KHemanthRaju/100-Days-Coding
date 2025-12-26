class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0 || intervals==null){
            return new int[0][0];
        }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int[] interval:intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<interval[0]){
                ans.add(interval);
            }else{
                int[] last = ans.get(ans.size()-1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}