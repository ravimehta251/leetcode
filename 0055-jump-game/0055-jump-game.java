class Solution {
    public boolean canJump(int[] nums) {
         int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE-2);
        arr[0]=0;
        for(int i=0;i<n;i++){
            int k=nums[i];
            int j=i+1;
            while(j<=i+k && j<n){
                arr[j]=Math.min(arr[i]+1,arr[j]);
                j++;
            }
        }
        return arr[n-1]!=Integer.MAX_VALUE-2;
    }
}