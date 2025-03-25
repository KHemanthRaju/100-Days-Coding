class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int minval = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minval){
                minval = prices[i];
            }
            if(max_profit<prices[i]-minval){
                max_profit = prices[i]-minval;
            }
        }
        return max_profit;
    }
}