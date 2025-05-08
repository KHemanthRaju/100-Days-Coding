class Solution {
    public int maxProfit(int[] prices) {
        int minVal = prices[0];
        int maxProfit = 0;

        for(int price : prices){
            if(minVal>price){
                minVal = price;
            }
            if(maxProfit < price - minVal){
                maxProfit = price - minVal;
            }
        }
        return maxProfit;
    }
}