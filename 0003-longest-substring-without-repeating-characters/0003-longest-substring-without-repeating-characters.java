class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> set=new LinkedList<>();
        HashSet<Character> q = new HashSet<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(q.contains(c)){
                char ch = set.poll();
                q.remove(ch);
            }
            set.add(c);
            q.add(c);
            if(max<set.size()){
                max=set.size();
            }
        }
        return max;
    }
}