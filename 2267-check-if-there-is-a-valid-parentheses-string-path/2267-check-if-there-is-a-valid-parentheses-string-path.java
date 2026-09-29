class Solution {
    int m, n;
    Boolean[][][] dp;

    public boolean dfs(char[][] grid, int i, int j, int balance) {
        if (i >= m || j >= n) {
            return false;
        }

        if (grid[i][j] == '(') {
            balance++;
        } else {
            balance--;
        }

        if (balance < 0) {
            return false;
        }

        // Remaining cells must be enough to close parentheses
        int remaining = (m - 1 - i) + (n - 1 - j);
        if (balance > remaining) {
            return false;
        }

        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }

        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }

        boolean ans = dfs(grid, i + 1, j, balance)
                   || dfs(grid, i, j + 1, balance);

        return dp[i][j][balance] = ans;
    }

    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        if ((m + n) % 2 == 0) {
            return false;
        }

        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }

        dp = new Boolean[m][n][m + n];

        return dfs(grid, 0, 0, 0);
    }
}