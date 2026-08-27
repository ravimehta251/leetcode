class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] c=new int[26];
        int len=s1.length();
        for(int j=0;j<s1.length();j++){
            c[s1.charAt(j)-'a']++;
        }
        for(int j=0;j<s2.length();j++){
            int da=s2.charAt(j)-'a';
            if(c[da]!=0){
                int p=len;
                int[] c1=c.clone();
                for(int i=j;i<s2.length();i++){
                    int l1=s2.charAt(i)-'a';
                    if(c1[l1]==0){
                        break;
                    }
                    c1[l1]--;
                    p--;
                    if(p==0){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}