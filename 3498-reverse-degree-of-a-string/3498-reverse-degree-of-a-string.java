class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            int l=s.charAt(i-1)-'a';
            l=26-l;
            sum+=i*l;

        }
        return sum;
    }
}