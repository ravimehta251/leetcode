class Solution {
    public  class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            
        }
    }
    public  List<List<Integer>> ar;
    public int dest;
    public  void dfs(ArrayList<Edge> graph[] ,int curr, boolean vis[],ArrayList<Integer> ar1){
         ar1.add(curr);
        if(curr==dest){
            ar.add(new ArrayList<>(ar1));
        }
        vis[curr]=true;
       
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis,ar1);
            }
        }
        vis[curr]=false;
        ar1.remove(ar1.size()-1);

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int V=graph.length;
        this.dest=V-1;
        ArrayList<Edge> graph1[] =new ArrayList[V];
        for(int i=0;i<V;i++){
            graph1[i]=new ArrayList<Edge>();
            for(int j=0;j<graph[i].length;j++){
                graph1[i].add(new Edge(i,graph[i][j]));
            }
        }
        this.ar=new ArrayList<>();
        boolean[] vis=new boolean[V];
        dfs(graph1,0,vis,new ArrayList<>());
        return ar;


        
    }
}