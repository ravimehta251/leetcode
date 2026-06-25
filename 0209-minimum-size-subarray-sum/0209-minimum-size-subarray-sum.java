class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,size=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j++];
            while(i<nums.length && target<=sum){
                 size = Math.min(size, j - i);
                sum-=nums[i++];
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }
}