class Solution {
    public int countNegatives(int[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            res+= countNegativeEachRow(grid[i]);
        }
        return res;
    }
    
    private int countNegativeEachRow(int[] grid){
        int res = 0;
        int l = 0;
        int r = grid.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(grid[mid]>=0){
                l = mid+1;
            }else{
                res+=r-mid+1;
                r = mid-1;
            }
        }
        return res;
    }
}