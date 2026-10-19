class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ar.add(i);
            }
            if(target<nums[i]){
                break;
            }
        }
        return ar;
    }
}