class Solution {
    class Node {
        Node[] children = new Node[26];
        boolean eow;
        String word;
    }

    private Node root;
    private boolean[][] vis;
    private List<String> ar;
    private int m, n;

    public void addword(String[] words) {
        for (String word : words) {
            Node curr = root;

            for (char c : word.toCharArray()) {
                int idx = c - 'a';

                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }

                curr = curr.children[idx];
            }

            curr.eow = true;
            curr.word = word;
        }
    }

    public void dfs(char[][] board, Node curr, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j]) {
            return;
        }

        int idx = board[i][j] - 'a';

        if (curr.children[idx] == null) {
            return;
        }

        curr = curr.children[idx];

        if (curr.eow) {
            ar.add(curr.word);
            curr.eow = false;
        }

        vis[i][j] = true;

        dfs(board, curr, i + 1, j);
        dfs(board, curr, i - 1, j);
        dfs(board, curr, i, j + 1);
        dfs(board, curr, i, j - 1);

        vis[i][j] = false;
    }

    public List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;

        root = new Node();
        ar = new ArrayList<>();
        vis = new boolean[m][n];

        addword(words);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, root, i, j);
            }
        }

        return ar;
    }
}