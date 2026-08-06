class Solution {
    public int countSubstrings(String s) {
        int pal=0;
        for(int i=0;i<s.length();i++){
            int j=i,k=i;
            while(0<=j && k<s.length() && s.charAt(j)==s.charAt(k)){
                
                pal++;
                j--;
                k++;
            }
            j=i;
            k=i+1;
            while(0<=j && k<s.length() && s.charAt(j)==s.charAt(k)){
                
                pal++;
                j--;
                k++;
            }
        }
        return pal;
        
    }
}