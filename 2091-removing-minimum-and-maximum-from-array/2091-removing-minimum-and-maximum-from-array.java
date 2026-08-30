class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mini = 0, maxi = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[mini]) {
                mini = i;
            }

            if (nums[i] > nums[maxi]) {
                maxi = i;
            }
        }

        int left = Math.min(mini, maxi);
        int right = Math.max(mini, maxi);

        int fromFront = right + 1;

        int fromBack = n - left;

        int fromBoth = (left + 1) + (n - right);

        return Math.min(fromFront, Math.min(fromBack, fromBoth));
    }
}