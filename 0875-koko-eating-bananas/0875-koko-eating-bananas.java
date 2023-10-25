class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0, high = (int)1e9;
        while(low<high){
            int mid = low + (high - low)/2;
            if(feasible(piles,mid,h)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    
    
    public boolean feasible(int[] piles, int mid, int h){
        long res = 0;
        for(int p:piles){
            if(mid== 0){
                return false;
            }
            res += (p + mid - 1)/mid;
        }
        return res <= h;
    }
}