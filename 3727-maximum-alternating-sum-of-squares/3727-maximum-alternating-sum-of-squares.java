class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        long sum=0;
        boolean b=true;
        while(i<=j){
            if(b){
                b=false;
                sum=sum+nums[j]*nums[j];
                j--;
            }else{
                b=true;
                sum=sum-nums[i]*nums[i];
                i++;
            }

        }
        return sum;
    }
}