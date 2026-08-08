class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;

        while (i <= k) {

            if (nums[i] == 0) {
               
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;

            } else if (nums[i] == 1) {
                
                if (j < i) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                i++;

            } else {
                
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                k--;
            }
        }
    }
}