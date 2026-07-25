class Solution {
    public int maxProduct(int n) {
        int max=0,sec=0;
        while(n!=0){
            int k=n%10;
            n=n/10;
            if(max<=k){
                sec=max;
                max=k;
            }else if(sec<k){
                sec=k;
            }
        }
        return max*sec;
    }

}