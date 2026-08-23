class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long max=0;
        long min=1;
        int n=piles.length;
        for(long p:piles){
            if(max<p){
                max=p;
            }
        }
        while(min<=max){
            long mid=min+(max-min)/2;
            long hour=0;
            for(long p:piles){
                hour += (p + mid - 1) / mid;
            }
            if(hour<=h){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return (int)max+1;
    }
}