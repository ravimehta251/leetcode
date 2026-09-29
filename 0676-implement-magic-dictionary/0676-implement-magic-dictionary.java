class MagicDictionary {
    public class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    private Node root;

    public MagicDictionary() {
        root = new Node();
    }

    public void buildDict(String[] dictionary) {
        for (String s : dictionary) {
            Node curr = root; // Reset for every word

            for (char c : s.toCharArray()) {
                int i = c - 'a';

                if (curr.children[i] == null) {
                    curr.children[i] = new Node();
                }

                curr = curr.children[i];
            }

            curr.eow = true;
        }
    }

    public boolean search(String searchWord) {
        return dfs(searchWord, 0, root, true);
    }

    public boolean dfs(String word, int i, Node curr, boolean b) {
        if (i == word.length()) {
            return curr.eow && !b;
        }

        int k = word.charAt(i) - 'a';

        // Match the current character
        if (curr.children[k] != null) {
            if (dfs(word, i + 1, curr.children[k], b)) {
                return true;
            }
        }

        // Change exactly one character
        if (b) {
            for (int j = 0; j < 26; j++) {
                if (j == k || curr.children[j] == null) {
                    continue;
                }

                if (dfs(word, i + 1, curr.children[j], false)) {
                    return true;
                }
            }
        }

        return false;
    }
}