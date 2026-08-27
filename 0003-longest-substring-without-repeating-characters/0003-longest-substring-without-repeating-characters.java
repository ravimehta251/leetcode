class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            while(set.contains(c)){
                set.remove(s.charAt(i++));
            }
            set.add(c);
            if(j<set.size()){
                j=set.size();
            }
        }
        return j;
    }
}