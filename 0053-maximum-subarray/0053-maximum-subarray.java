class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,l=0;
        for(int i=0;i<nums.length;i++){
             l=l+nums[i];
            max=Math.max(l,max);
            if(l<0){
                l=0;
            }
        }
        return max;
    }
}