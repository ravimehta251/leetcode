class Solution {
    public int characterReplacement(String s, int k) {
        int[] cha = new int[26];

        int i = 0, j = 0;
        int max = 0;
        int maxFreq = 0;

        while (i < s.length()) {

            int p = s.charAt(i) - 'A';
            cha[p]++;

            maxFreq = Math.max(maxFreq, cha[p]);

            while ((i - j + 1) - maxFreq > k) {
                cha[s.charAt(j) - 'A']--;
                j++;
            }

            max = Math.max(max, i - j + 1);

            i++;
        }

        return max;
    }
}