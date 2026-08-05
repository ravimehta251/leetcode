class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ar=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            int p=(int)(s.charAt(i)-'a');
            ar[p]++;
            p=(int)(t.charAt(i)-'a');
            ar[p]--;
        }
        for(int i=0;i<26;i++){
            if(ar[i]!=0){
                return false;
            }
        }
        return true;
    }
}