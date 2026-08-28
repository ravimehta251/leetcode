class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int l=0,r=0;
        for(int i=0;i<n;i++){
            left[i]=l;
            l+=nums[i];
            right[n-i-1]=r;
            r+=nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
     }
}