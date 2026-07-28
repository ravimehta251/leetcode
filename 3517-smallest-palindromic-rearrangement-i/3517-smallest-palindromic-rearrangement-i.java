class Solution {
    public String smallestPalindrome(String s) {
        int[] ar = new int[26];

        for (char c : s.toCharArray()) {
            ar[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            int count = ar[i];

            if (count % 2 == 1) {
                middle = (char) ('a' + i);
            }

            int k = count / 2;
            while (k > 0) {
                left.append((char) ('a' + i));
                k--;
            }
        }

       
        right.append(left).reverse();

        
        if (middle != 0) {
            return left.toString() + middle + right.toString();
        } else {
            return left.toString() + right.toString();
        }
    }
}