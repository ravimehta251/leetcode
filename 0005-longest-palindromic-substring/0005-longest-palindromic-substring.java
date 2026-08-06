class Solution {
    public boolean pali(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String pal="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(s.substring(i,j).length()>pal.length() && pali(s.substring(i,j))){
                    
                        pal=s.substring(i,j);
                    
                }
            }
        }
        return pal;
    }
}