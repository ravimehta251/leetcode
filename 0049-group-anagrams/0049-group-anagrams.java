class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String> > map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String p=new String(s);
             map.putIfAbsent(p, new ArrayList<>());
            map.get(p).add(strs[i]);
        }
        List<List<String>>  ar1=new ArrayList<>();
        for(List<String> arp: map.values()){
            ar1.add(new ArrayList(arp));
        }
        return ar1;
    }
}