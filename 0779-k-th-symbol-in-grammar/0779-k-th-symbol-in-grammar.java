class Solution {
    public int kthGrammar(int n, int k) {
        int result = 0;

        while (n > 1) {
            if (k % 2 == 0) {
                result = 1 - result;
            }

            k = (k + 1) / 2;
            n--;
        }

        return result;
    }
}