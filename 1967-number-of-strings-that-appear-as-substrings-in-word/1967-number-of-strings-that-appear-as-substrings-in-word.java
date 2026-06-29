class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int count =0;
        for(String sp:patterns){
            if(word.contains(sp)){
                count++;
            }
        }
        return count;
    }
}