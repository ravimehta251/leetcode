class Solution {
    public int maximumGap(int[] nums) {
        int diff=0;
        int n=nums.length-1;
        if(n<=0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            int k=nums[i]-nums[i-1];
            if(diff<k){
                diff=k;
            }
        }
        return diff;
    }
}