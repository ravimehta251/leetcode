class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int pro=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }else{
                  
                  if(pro<(prices[i]-buy)){
                    pro=prices[i]-buy;
                  }
            }

        }
        return pro;
    }
}