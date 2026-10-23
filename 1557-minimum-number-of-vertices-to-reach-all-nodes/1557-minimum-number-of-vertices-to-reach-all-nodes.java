class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] b=new boolean[n];
        for(int i=0;i<edges.size();i++){
            b[edges.get(i).get(1)]=true;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!b[i]){
                arr.add(i);
            }
        }
        return arr;
    }
}