class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length-1;
        int m=nums[0]*nums[1]*nums[n];
        int p=nums[n-2]*nums[n-1]*nums[n];
        return Math.max(m,p);
    }
}