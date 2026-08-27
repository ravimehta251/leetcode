class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] k={-1,-1};
        int j=numbers.length-1;
        int i=0;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                k[0]=i+1;
                k[1]=j+1;
                return k;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return k;
    }
}