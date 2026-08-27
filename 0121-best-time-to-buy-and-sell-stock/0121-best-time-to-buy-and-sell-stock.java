class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int i=1,max=0;
        while(i<prices.length){
            max=Math.max(max,prices[i]-buy);
            if(prices[i]<buy){
                buy=prices[i];
            }
            i++;
        }
        return max;
    }
}