class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        List<Integer> ar=new ArrayList<>();
        for(int num:nums2){
            if(set.contains(num)){
                ar.add(num);
                set.remove(num);
            }
        }
        int[] ar1=new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            ar1[i]=ar.get(i);

        }
        return ar1;
    }
}