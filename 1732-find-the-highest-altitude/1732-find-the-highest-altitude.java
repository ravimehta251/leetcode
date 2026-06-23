class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int l=0;
        for(int i=0;i<gain.length;i++){
            l+=gain[i];
            if(max<l){
                max=l;
            }
        }
        return max;
    }
}