class Solution {
    public String maxSumOfSquares(int num, int sum) {
   
        String s="";
        char[] su=new char[num];
        Arrays.fill(su,'0');
        for(int i=0;i<num;i++){
            int k=Math.min(9,sum);
                if(k<=sum){
                    su[i]=(char)(k+'0');
                    sum-=k;
                    if( sum==0){
                        return new String(su);
                    }
                }
        }
        return s;
    }
}