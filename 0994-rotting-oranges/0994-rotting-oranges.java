class Solution {
    public int n,m;
    public void bfs(int[][] grid, int[][] dp, int i, int j, int t) {

        // Boundary / empty / rotten orange
        if (i < 0 || i >= n || j < 0 || j >= m ||
            grid[i][j] == 0 || grid[i][j] == 2) {
            return;
        }

        // If already reached faster, stop
        if (dp[i][j] != 0 && dp[i][j] <= t) {
            return;
        }

        dp[i][j] = t;

        bfs(grid, dp, i - 1, j, t + 1);
        bfs(grid, dp, i + 1, j, t + 1);
        bfs(grid, dp, i, j - 1, t + 1);
        bfs(grid, dp, i, j + 1, t + 1);
    }
    public int orangesRotting(int[][] grid) {
         this.n=grid.length;
         this.m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    bfs(grid, dp, i - 1, j, 1);
                    bfs(grid, dp, i + 1, j, 1);
                    bfs(grid, dp, i, j - 1, 1);
                    bfs(grid, dp, i, j + 1, 1);
                }
            }
        }
        int min=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && dp[i][j]==0){
                    return -1;
                }
                if(grid[i][j]==1){
                    min=Math.max(min,dp[i][j]);
                }

                
            }
        }
        return min;
    }
}