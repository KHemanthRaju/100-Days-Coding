class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = prices[0];

        for(int i=1;i<prices.length;i++){
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
        }
        return maxProfit;
    }
}

// [7,1,5,3,6,4]

// lowest cost = 1 -> will buy the stock

// sell the stock in other day -> 6

// diff = 6-1 = 5

// minValue = 7, maxProfit = 0
// minValue = 1, maxProfit = 0
//minValue = 1, maxProfit = 4

//mINvALUE = 1, MaxProfit = 5