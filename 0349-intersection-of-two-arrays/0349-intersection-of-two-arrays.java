class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> ar=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j] ){
                if(ar.size()==0 || ar.get(ar.size()-1)!=nums1[i]){
                    ar.add(nums2[j]);
                }
                i++;
                j++;

            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] a=new int[ar.size()];
        for( i=0;i<ar.size();i++){
            a[i]=ar.get(i);
        }
        return a;
    }
}