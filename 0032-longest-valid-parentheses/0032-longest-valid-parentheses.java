class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int left=0,right=0,max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right ++;
            }
            if(right>left){
                left=0;
                right=0;
            }else if(right==left){
                int num=right*2;
                if(num>max){
                    max=num;
                }
            }
        }
        left=0;
        right=0;
         for(int i=n-1;i>-1;i--){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right ++;
            }
            if(left>right){
                left=0;
                right=0;
            }else if(right==left){
                int num=right*2;
                if(num>max){
                    max=num;
                }
            }
        }
        return max;
        
    }
}