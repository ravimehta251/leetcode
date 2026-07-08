class Solution {
    public long sumAndMultiply(int n) {
        long x=0,sum=0,i=0;
        while(n!=0){
            int last=n%10;
            n=n/10;

            if(last!=0){
                x=x+last*(long)Math.pow(10,i++);
                sum+=last;
            }
        }
        return x*sum;
    }
}