class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        int minl = -1, minr = -1, l = 0;

        for (int i = 1; i < n * 2; i++) {
            int k = i % n;
            int prev = (k - 1 + n) % n;

            if (nums[prev] < nums[k]) {
                l++;

                if (l == n - 1) {
                    int rotations = (i - n + 1) % n;

                    
                    minl = Math.min(rotations, n - rotations + 2);
                    break;
                }
            } else {
                l = 0;
            }
        }
        if(minl!=-1){
            return minl;
        }

        l = 0;
        for (int i = n * 2 - 1; i >= 1; i--) {
            int k = i % n;
            int next = (k + 1) % n;

            if (nums[k] > nums[next]) {
                l++;

                if (l == n - 1) {
                    
                    minr = 1 + Math.min(k, n - k);
                    break;
                }
            } else {
                l = 0;
            }
        }

        if (minl == -1) return minr;
        if (minr == -1) return minl;

        return Math.min(minl, minr);
    }
}