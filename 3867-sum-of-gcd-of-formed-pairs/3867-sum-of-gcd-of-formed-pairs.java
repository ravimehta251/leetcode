class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=0;
        int k=nums.length-1;
        for(int i=0;i<=k;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            nums[i]=gcd(max,nums[i]);
        }
        Arrays.sort(nums);
        long sum=0;
        int n=nums.length/2;
        int i=0;
        
        while(i<n){
            sum+=gcd(nums[i],nums[k-i]);
            i++;
        }
        return sum;
        
    }
}