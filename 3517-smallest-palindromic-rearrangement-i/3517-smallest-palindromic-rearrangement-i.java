class Solution {
    public String smallestPalindrome(String s) {
        int[] ar=new int[26];
        
        for(char c:s.toCharArray()){
            int o=c-'a';
            ar[o]++;
        }
        StringBuilder sr=new StringBuilder();
        int odd=-1;
    
        for(int i=0;i<26;i++){
            if(ar[i]!=0 && ar[i]>=2){
                int k=ar[i]/2;
                while(k>0){
                    char c=(char)('a'+i);
                    sr.append(c);
                    k--;
                }
            }
            if(ar[i]%2==1){
                odd=i;
            }
            
        }
        if(odd!=-1){
             char c=(char)('a'+odd);
            sr.append(c);
        }
         for(int i=25;i>=0;i--){
            if(ar[i]!=0 ){
                int k=ar[i]/2;
                while(k>0){
                    char c=(char)('a'+i);
                    sr.append(c);
                    k--;
                }
            }
         }
         return sr.toString();


    }
}