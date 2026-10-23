import java.util.*;

class Solution {
    public class Edge {
        int src;
        int dest;
        double w;

        public Edge(int src, int dest, double w) {
            this.src = src;
            this.dest = dest;
            this.w = w;
        }
    }

    public double maxProbability(int n, int[][] edges,
                                 double[] succProb,
                                 int source, int destination) {

        ArrayList<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            int src = edges[i][0];
            int dest = edges[i][1];

            graph[src].add(new Edge(src, dest, succProb[i]));
            graph[dest].add(new Edge(dest, src, succProb[i]));
        }

        double[] prob = new double[n];
        prob[source] = 1.0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.w, a.w)
        );

        pq.add(new Edge(-1, source, 1.0));

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();

            int u = curr.dest;
            double p = curr.w;

            if (p < prob[u]) continue;

            if (u == destination) {
                return p;
            }

            for (Edge e : graph[u]) {
                int v = e.dest;
                double newProb = p * e.w;

                if (newProb > prob[v]) {
                    prob[v] = newProb;
                    pq.add(new Edge(u, v, newProb));
                }
            }
        }

        return 0.0;
    }
}