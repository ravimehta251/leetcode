class Solution {
    public int scoreOfParentheses(String s) {
        int n=0,o=0, i=0;
        for (char c:s.toCharArray()){
            if(c=='('){
                n++;
            }else{
                n--;
                if (s.charAt(i - 1) == '(') {
                    o += 1 << n;  
                }
            }
            i++;
        }
        return o;
    }
}