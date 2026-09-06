class Solution {
    public int findDuplicate(int[] nums) {
        int[] num1=new int[nums.length];
        for(int num:nums){
            
            if(num1[num]==1){
                return num;
            }else{
                num1[num]=1;
            }
        }
        return 0;
    }
}