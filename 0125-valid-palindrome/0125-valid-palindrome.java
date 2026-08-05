class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sr=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sr.append(c);
            }
        }
        int i=0,j=sr.length()-1;
        while(i<j){
            if(sr.charAt(i)!=sr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}