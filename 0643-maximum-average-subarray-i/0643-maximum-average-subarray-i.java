class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double l=Integer.MIN_VALUE;
        double sum=0;
        int i=0,j=0;
    
        for(j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i==k-1){
                l=Math.max(l,sum/k);
                sum-=nums[i++];
            }
        }
        return l;
    }
}