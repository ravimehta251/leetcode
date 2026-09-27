class WordDictionary {
    public class Node{
        Node[] children = new Node[26];
        boolean eow = false;
    }
    private Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.children[i]==null){
                curr.children[i]=new Node();
            }
            curr=curr.children[i];
        }
        curr.eow = true;
    }
   public boolean dfs(String word, int j, Node curr) {
    if (word.length() == j) {
        return curr.eow;
    }

    if (word.charAt(j) == '.') {
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                if (dfs(word, j + 1, curr.children[i])) {
                    return true;
                }
            }
        }
    } else {
        int index = word.charAt(j) - 'a';

        if (curr.children[index] != null) {
            return dfs(word, j + 1, curr.children[index]);
        }
    }

    return false;
}
    
    public boolean search(String word) {
        Node curr=root;
        for(char c:word.toCharArray()){
            if(c=='.'){
                return dfs(word,0,root);
            }
            int i=c-'a';
            if(curr.children[i]==null){
                return false;
            }
            curr=curr.children[i];
        }
        return curr.eow;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */