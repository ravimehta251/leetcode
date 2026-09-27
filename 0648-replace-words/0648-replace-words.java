class Solution {
    public String replaceWords(List<String> d, String sentence) {
        HashSet<String> set = new HashSet<>();

        for (String word : d) {
            set.add(word);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            String root = word;

            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);

                if (set.contains(prefix)) {
                    root = prefix;
                    break;
                }
            }

            ans.append(root).append(" ");
        }

        return ans.toString().trim();
    }
}