import java.util.*;

class Solution {
    public int m, n, count;
    public int[][] dp;
    public HashMap<Integer, Integer> size = new HashMap<>();

    public int dfs(int[][] grid, int i, int j, boolean[][] vis, int id) {

        if (i < 0 || j < 0 || i >= m || j >= n ||
            grid[i][j] == 0 || vis[i][j]) {
            return count;
        }

        count++;
        vis[i][j] = true;
        dp[i][j] = id;

        dfs(grid, i + 1, j, vis, id);
        dfs(grid, i - 1, j, vis, id);
        dfs(grid, i, j + 1, vis, id);
        dfs(grid, i, j - 1, vis, id);

        return count;
    }

    public int largestIsland(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.dp = new int[m][n];

        boolean[][] vis = new boolean[m][n];
        int id = 1;
        int max = 0;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    count = 0;
                    dfs(grid, i, j, vis, id);

                    size.put(id, count);
                    max = Math.max(max, count);
                    id++;
                }
            }
        }

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) {
                    count = 1;

                    HashSet<Integer> set = new HashSet<>();

                    if (i + 1 < m)
                        set.add(dp[i + 1][j]);

                    if (i - 1 >= 0)
                        set.add(dp[i - 1][j]);

                    if (j + 1 < n)
                        set.add(dp[i][j + 1]);

                    if (j - 1 >= 0)
                        set.add(dp[i][j - 1]);

                    for (int x : set) {
                        count += size.getOrDefault(x, 0);
                    }

                    max = Math.max(max, count);
                }
            }
        }

        return max;
    }
}