class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        int count=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                int coun=0;
                while(i<n && s.charAt(i)=='0'){
                    coun++;
                    i++;
                 }
                 ar.add(coun);
            }
        }
        for(int i=0;i<n;i++) if(s.charAt(i)=='1') count++;
        int max=0;
        for(int i=1;i<ar.size();i++){
            max=Math.max(max,ar.get(i)+ar.get(i-1));
        }
        return count+max;
        
    }
}