class Solution {

    int solve(int i, int j, int[] nums) {

        // No elements left
        if (i > j) {
            return 0;
        }

        // Only one element
        if (i == j) {
            return nums[i];
        }

        // Pick left
        int take_i = nums[i] + Math.min(
            solve(i + 2, j, nums),
            solve(i + 1, j - 1, nums)
        );

        // Pick right
        int take_j = nums[j] + Math.min(
            solve(i, j - 2, nums),
            solve(i + 1, j - 1, nums)
        );

        return Math.max(take_i, take_j);
    }

    public boolean predictTheWinner(int[] nums) {

        int n = nums.length;

        int total = 0;

        for (int x : nums) {
            total += x;
        }

        int player1 = solve(0, n - 1, nums);

        int player2 = total - player1;

        return player1 >= player2;
    }
}