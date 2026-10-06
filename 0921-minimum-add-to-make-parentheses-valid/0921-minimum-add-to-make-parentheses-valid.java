class Solution {
    public int minAddToMakeValid(String s) {
        int life=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else{
                if(count==0){
                    life++;
                }else{
                count--;
                }
            }
        }
        return life+count;
    }
}