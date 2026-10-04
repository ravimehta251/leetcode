class Solution {

    Boolean[][] dp;

    public boolean dfs(String s, int i, int open) {

        if (open < 0) {
            return false;
        }

        if (i == s.length()) {
            return open == 0;
        }

        if (dp[i][open] != null) {
            return dp[i][open];
        }

        char c = s.charAt(i);

        boolean ans;

        if (c == '(') {

            ans = dfs(s, i + 1, open + 1);

        } else if (c == ')') {

            ans = dfs(s, i + 1, open - 1);

        } else {

            // '*' = empty
            boolean empty = dfs(s, i + 1, open);

            // '*' = '('
            boolean opening = dfs(s, i + 1, open + 1);

            // '*' = ')'
            boolean closing = dfs(s, i + 1, open - 1);

            ans = empty || opening || closing;
        }

        return dp[i][open] = ans;
    }

    public boolean checkValidString(String s) {

        int n = s.length();

        dp = new Boolean[n][n + 1];

        return dfs(s, 0, 0);
    }
}