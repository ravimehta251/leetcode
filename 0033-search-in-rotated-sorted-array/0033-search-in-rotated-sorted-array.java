class Solution {

    public int binary(int[] nums, int i, int j, int target) {
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public int piv(int[] nums, int i, int j) {
        while (i < j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public int search(int[] nums, int target) {
        int n = nums.length - 1;

        int pivot = piv(nums, 0, n);

        if (target >= nums[pivot] && target <= nums[n]) {
            return binary(nums, pivot, n, target);
        } else {
            return binary(nums, 0, pivot - 1, target);
        }
    }
}