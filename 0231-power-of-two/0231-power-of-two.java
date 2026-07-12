class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        String s=Integer.toBinaryString(n);
        int count=0,i=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                count++;
                if(2<=count){
                    return false;
                }
            }
        }
        
        return true;
    }
}