class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = prices[0];

        for(int i=1;i<prices.length;i++){
            if(minVal > prices[i]){
                minVal = prices[i];
            }
            if(maxProfit < prices[i] - minVal){
                maxProfit = prices[i] - minVal;
            }
        }
        return maxProfit;
    }
}