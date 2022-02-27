class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int min = prices[0];
        if(prices.length <= 1)
                return 0;
        for(int i =1; i < prices.length; i++){
            if(prices[i] - min > diff)
                diff = prices[i]-min;
            if(min > prices[i])
                min = prices[i];
        }
        return diff;
    }
}
