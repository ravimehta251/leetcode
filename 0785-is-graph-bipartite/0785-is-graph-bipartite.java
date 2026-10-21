class Solution {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src=src;
            this.dest=dest;

        }
    }
    public static boolean IsBiaparttite(ArrayList<Edge>[] graph){
        int[] col=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            col[i]=-1;
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < graph.length ; i++) {
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for (int j = 0; j <graph[curr].size() ; j++) {
                        Edge e=graph[curr].get(j);
                        if(col[e.dest]==-1){
                            int nextcolor=col[curr]==0?1:0;
                            col[e.dest]=nextcolor;
                            q.add(e.dest);
                        }else if(col[e.dest]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] grap) {
        int m=grap.length;
    
        ArrayList<Edge>[] graph =new ArrayList[m];
        for(int i=0;i<m;i++){
            graph[i]=new ArrayList();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<grap[i].length;j++){
                graph[i].add(new Edge(i,grap[i][j]));
            }
        }
        return IsBiaparttite(graph);

    }
}