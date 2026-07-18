class Solution {
     public int dfs(int m, int n,int[][] dp) {
        if (m <= 0 || n <= 0)
            return 0;
        if(m-1 ==0 && n-1==0){
            return 1;
        }
        if (dp[m][n] != 0)
            return dp[m][n];
        dp[m][n] = dfs(m - 1, n, dp) + dfs(m, n - 1, dp);

        return dp[m][n];
       
        

    }

    public int uniquePaths(int m, int n) {
       int[][] dp=new int[m+1][n+1];
       return dfs(m,n,dp);

    }
}