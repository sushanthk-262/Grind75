class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 0;
        int max_p = 0;
        int p = 0;

        int days = prices.length;
        int cheapest = prices[0];

        for(int i = 0; i < days; i++){
            if(prices[i] < cheapest){
                cheapest = prices[i];a
                continue;
            }
            p = prices[i] - cheapest;
            if(p > max_p){
                max_p = p;
            }
        }
        return max_p;
    }
}