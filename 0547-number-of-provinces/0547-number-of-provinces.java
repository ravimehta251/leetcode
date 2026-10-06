class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        boolean[] vis = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {

            
            if (!vis[i]) {

                count++;

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {

                    int node = q.poll();

                    for (int neighbour : graph.get(node)) {

                        if (!vis[neighbour]) {
                            vis[neighbour] = true;
                            q.add(neighbour);
                        }
                    }
                }
            }
        }

        return count;
    }
}