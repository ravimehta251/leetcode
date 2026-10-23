class Solution {
    public class Edge{
        int src;
        int dest;
        public Edge(int src ,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public boolean dfs(ArrayList<Edge>[] graph, int src ,int dest,boolean[] vis){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            int des=graph[src].get(i).dest;
            if(!vis[des]){
                if(dfs(graph,des,dest,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Edge>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            graph[src].add(new Edge(src,dest));
            graph[dest].add(new Edge(dest,src));
        }
        boolean[] vis=new boolean[n];
        return dfs(graph,source,destination,vis);
    }
}