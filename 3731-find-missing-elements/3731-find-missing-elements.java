class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ar=new ArrayList<>();
        Arrays.sort(nums);
        int j=0,n=nums.length-1;
        for(int i=nums[0];i<nums[n];i++){
            if(nums[j]==i){
                j++;
            }else{
                ar.add(i);
            }
        }
        return ar;
    }
}