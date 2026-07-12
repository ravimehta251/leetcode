class Solution {
    public long wonderfulSubstrings(String word) {
        long ans=0;
        int mask=0;
        long seenBinary[]=new long[1024];
        seenBinary[0]=1;

        for(char ch:word.toCharArray()){
            int binary=1<<(ch-'a');
            mask=mask^binary;
            ans+=seenBinary[mask];
            for(int i=0;i<10;i++){
                int newbinary=1<<i;
                ans+=seenBinary[mask^newbinary];
            }
            seenBinary[mask]++;
        }
            return ans;


        

    }
}