class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue =prices[i];
            }
            
            if(prices[i]-minValue>maxValue){
                maxValue = prices[i] - minValue;
            }
        }
        
        return maxValue;
    }
}