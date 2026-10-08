class Solution {
    public String removeOuterParentheses(String s) {
        String p="";
        int c=0;
        for(char l:s.toCharArray()){
            if(l=='('){
                if(0<c){
                    p+=l;
                }
                c++;
            }else{
                if(1<c){
                    p+=l;
                }
                c--;
            }
        }
        return p;
    }
}