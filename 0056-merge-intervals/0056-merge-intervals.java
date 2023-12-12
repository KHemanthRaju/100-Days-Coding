class Solution {
    public int[][] merge(int[][] intervals) {
        //sort the array based on 0th index
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        //to store merged ans, create a linkedlist
        LinkedList<int[]> merged = new LinkedList<>();
        //for loop to iterate and compare each interval
        for(int[] interval:intervals){
            //for non-overlapping condition
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else{
                //for overlapping condition
                merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
            }
        }
        //convert linkedlist back to array and return it
        return merged.toArray(new int[merged.size()][]);
    }
}