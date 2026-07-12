class Solution {
    public int findComplement(int num) {
       StringBuilder s = new StringBuilder(Integer.toBinaryString(num));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                s.setCharAt(i, '0');
            }else{
               s.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(s.toString(), 2);
        
        
    }
}