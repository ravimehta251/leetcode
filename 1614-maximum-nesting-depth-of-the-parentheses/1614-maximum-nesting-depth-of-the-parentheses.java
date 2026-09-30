class Solution {
    public int maxDepth(String s) {
        int max=0;
        int q=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                q++;
            }else if(c==')'){
                q--;
            }
            if(q>max){
                max=q;
            }
        }
        return max;
    }
}