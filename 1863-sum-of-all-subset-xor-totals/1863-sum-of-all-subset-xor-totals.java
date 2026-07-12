class Solution {
    public int num=0;
    public void dfs(int[] nums,int i,int xor){
        if(i==nums.length){
            num+=xor;
            return ;
        }
        dfs(nums,i+1,xor);
        dfs(nums,i+1,xor^nums[i]);
        
    }
    public int subsetXORSum(int[] nums) {
        dfs(nums,0,0);
        return num;
    }
}