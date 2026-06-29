class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<word.length()+1;j++){
                s.add(word.substring(i,j));
            }
        }
        int count =0;
        for(String sp:patterns){
            if(s.contains(sp)){
                count++;
            }
        }
        return count;
    }
}