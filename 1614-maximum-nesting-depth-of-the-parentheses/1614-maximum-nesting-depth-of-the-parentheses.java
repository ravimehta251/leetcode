class Solution {
    public int maxDepth(String s) {
        int max=0;
        Queue<Character> q=new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                q.add(c);
            }else if(c==')'){
                q.poll();
            }
            if(q.size()>max){
                max=q.size();
            }
        }
        return max;
    }
}