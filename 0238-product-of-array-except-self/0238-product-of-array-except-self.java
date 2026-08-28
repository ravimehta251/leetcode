class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];   
        int[]  post=new int[n];
        post[n-1]=nums[n-1];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i];
            post[n-i-1]=post[n-i]*nums[n-i-1];
        }
        nums[0]=post[1];
        nums[n-1]=pre[n-2];
        for(int i=1;i<n-1;i++){
            nums[i]=pre[i-1]*post[i+1];
        }
        return nums;


    }
}