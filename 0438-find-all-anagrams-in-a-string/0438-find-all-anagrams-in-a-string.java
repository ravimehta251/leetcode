class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ar=new ArrayList<>();
        int[] ch=new int[26];
        int len1=p.length();
        for(char c:p.toCharArray()){
            int len=c-'a';
            ch[len]++;
        }
        for(int i=0;i<s.length();i++){
            int len=s.charAt(i)-'a';
            int j=i;
            if(ch[len]!=0){
                int[] ch1=ch.clone();
                int len2=len1;
                while(i<s.length() && ch1[s.charAt(i)-'a']!=0){
                    len2--;
                   
                    ch1[s.charAt(i)-'a']--;
                     i++;

                }
                if(len2==0){
                    ar.add(j);
                }
            }
            i=j;
        }
        return ar;
        
    }
}