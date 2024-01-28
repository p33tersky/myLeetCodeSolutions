class Solution(object):
    def maxProfit(self, prices):
        maxProfit = 0
        startIndex = 0
        minStock = min(prices)
        globalmin = minStock
        maxStock = max(prices)
        endIndex = prices.index(maxStock)
        subPrices = prices[:endIndex+1]

        if maxStock == minStock:
            return 0
    
        while startIndex < len(prices) and len(subPrices) > 0:
            maxStock = subPrices[::-1][0] 
            if(maxStock == globalmin):
                break
            minStock = min(subPrices)
            profit = maxStock - minStock
            if profit > maxProfit:
                maxProfit = profit
            startIndex += len(subPrices)
            if(startIndex >= len(prices)):
                break
            newEnd = prices[startIndex::].index(max(prices[startIndex::]))
        
            subPrices = prices[startIndex:startIndex+newEnd+1]
            
        return maxProfit