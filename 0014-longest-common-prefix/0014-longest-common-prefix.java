class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        for(String sp:strs){
            String p="";
            int n=s.length();
            for(int i=0;i<n && i<sp.length();i++){
                if(s.charAt(i)==sp.charAt(i)){
                    p=p+s.charAt(i);
                }else{
                    break;
                }
            }
            s=p;
        }
        return s;
    }
}