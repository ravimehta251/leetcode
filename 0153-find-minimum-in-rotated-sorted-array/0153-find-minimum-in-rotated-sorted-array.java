class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        if(nums[i]<=nums[j]){
            return nums[i];
        }
        int min=0;
       while (i < j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] > nums[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
     
        return nums[i];
    }
}