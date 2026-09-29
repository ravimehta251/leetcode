class MapSum {
    public class Node{
        Node[] child=new Node[26];
        int num=0;
    }
    private Node root;
    private HashMap<String, Integer> map;
    public MapSum() {
        root=new Node();
        map = new HashMap<>();

    }
    
    public void insert(String key, int val) {
        int diff = val - map.getOrDefault(key, 0);
        map.put(key, val);
        Node curr=root;
        for(char c:key.toCharArray()){
            int i=c-'a';
            if(curr.child[i]==null){
                curr.child[i]=new Node();
            }
            curr=curr.child[i];
            curr.num+=diff;
        }
    }
    
    public int sum(String key) {
        Node curr=root;
        int n=0;
        for(char c:key.toCharArray()){
             int i=c-'a';
            if(curr.child[i]==null){
                return 0;
            }
            curr=curr.child[i];
            n=curr.num;
        }
        return n;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */