class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ar = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ar[index--] = leftSquare;
                left++;
            } else {
                ar[index--] = rightSquare;
                right--;
            }
        }

        return ar;
    }
}