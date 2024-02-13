package DynamicProgramming.BestTimeToBuyAndSellStock;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int max_profit = 0;
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min_value){
                min_value = prices[i];
            }else if(prices[i] - min_value > max_profit){
                max_profit = prices[i] - min_value;
            }
        }
        return max_profit;
    }
}
/*
121
TC O(n)
SC O(1)
 */