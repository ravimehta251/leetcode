class Solution {
    
    public String longestPalindrome(String s) {
        String pal="";
        for(int i=0;i<s.length();i++){
            int j=i,k=i;
            while(0<=j && k<s.length() && s.charAt(j)==s.charAt(k)){
                
                if(pal.length()<k-j+1){
                    pal=s.substring(j,k+1);
                }
                j--;
                k++;
            }
            j=i;
            k=i+1;
            while(0<=j && k<s.length() && s.charAt(j)==s.charAt(k)){
                
                if(pal.length()<k-j+1){
                    pal=s.substring(j,k+1);
                }
                j--;
                k++;
            }
        }
        return pal;
    }
}