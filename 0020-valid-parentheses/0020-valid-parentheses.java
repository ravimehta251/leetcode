class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c== '{' || c=='['){
                st.add(c);
            }else if(c==')' && !st.isEmpty()){
                char z=st.pop();
                if(z!='('){
                    return false;
                }
            }
            else if(c=='}' && !st.isEmpty()){
                char z=st.pop();
                if(z!='{'){
                    return false;
                }
            }
            else if(c==']' && !st.isEmpty()){
                char z=st.pop();
                if(z!='['){
                    return false;
                }
            }else{
                return false;
            }
        }
        return st.isEmpty();
        
    }
}