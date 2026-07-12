class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        int[] num=new int[2];
        int i=0;
        for(int c:set){
            num[i++]=c;
        }
        return num;
    }
}