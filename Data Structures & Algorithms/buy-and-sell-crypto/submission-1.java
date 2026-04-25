class Solution {
    public int maxProfit(int[] prices) {
        // Brute force
        // int profit = 0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j = i+1;j<prices.length;j++){
        //         profit = Math.max(profit, prices[j]-prices[i]);
        //     }
        // }
        // return profit;
        int profit = 0;
        int buy  = 0, sell = 1;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]) profit = Math.max(profit, prices[sell]-prices[buy]);
            else{
                if(prices[buy]>prices[sell]) buy = sell; 
            }
            sell++;
        }
        return profit;
    }
}
