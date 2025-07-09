class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxValue = 0;
        for(int i=1;i<prices.length;i++){
            minValue = Math.min(minValue, prices[i]);
            maxValue = Math.max(prices[i]-minValue, maxValue);
        }
        return maxValue;
    }
}