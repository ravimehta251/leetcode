class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ar=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int num:nums){
            if(min>num){
                min=num;
            }
            if(max<num){
                max=num;
            }
        }
        for(int i=min;i<max;i++){
                ar.add(i);
        }
        for(int num:nums){
            ar.remove(Integer.valueOf(num));
        }
        return ar;
    }
}