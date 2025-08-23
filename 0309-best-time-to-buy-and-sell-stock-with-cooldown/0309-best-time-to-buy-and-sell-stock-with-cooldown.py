class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        
        n = len(prices)
        # Initialize states
        hold = -prices[0]    # profit if holding a stock
        sell = 0             # profit if just sold
        rest = 0             # profit if resting / cooldown
        
        for i in range(1, n):
            prev_hold = hold
            prev_sell = sell
            prev_rest = rest
            
            # Update states
            hold = max(prev_hold, prev_rest - prices[i])  # buy today or keep holding
            sell = prev_hold + prices[i]                 # sell today
            rest = max(prev_rest, prev_sell)             # rest today
        
        # Maximum profit will be in sell or rest state at the end
        return max(sell, rest)