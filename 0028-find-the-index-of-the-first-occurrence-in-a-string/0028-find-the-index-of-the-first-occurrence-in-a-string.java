class Solution {
    public int strStr(String heystack, String needle) {
        int k=needle.length();
        for(int i=0;i<=heystack.length()-k;i++){
            if(heystack.substring(i,i+k).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}