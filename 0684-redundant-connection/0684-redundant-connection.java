class Solution {

    public int find(int x, int[] p) {
        if (p[x] == x) {
            return x;
        }

        p[x] = find(p[x], p);
        return p[x];
    }

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length + 1;

        int[] p = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = i;
            r[i] = 1;
        }

        for (int i = 0; i < edges.length; i++) {

            int num1 = edges[i][0];
            int num2 = edges[i][1];

            int p1 = find(num1, p);
            int p2 = find(num2, p);

           
            if (p1 == p2) {
                return new int[]{num1, num2};
            }

            
            if (r[p1] >= r[p2]) {
                p[p2] = p1;
                r[p1]++;
            } else {
                p[p1] = p2;
                r[p2]++;
            }
        }

        return new int[2];
    }
}