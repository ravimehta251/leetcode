class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int k=1;
            int p=n;
            while(p!=0){
                k*=p%10;
                p=p/10;
            }
            if(k%t==0){
                break;
            }else{
                n++;
            }
            
        }
        return n;
    }
}