class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i=0;i<piles.length;i++){
            right = Math.max(right, piles[i]);
        }
        while(left < right){
            int mid = left + (right-left)/2;
            if(eat(piles,h,mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean eat(int[] piles,int h,int speed){
        int hours = 0;
        for(int pile : piles){
            hours += (int)Math.ceil((double)pile/speed);
        }
        return hours <= h;
    }
}