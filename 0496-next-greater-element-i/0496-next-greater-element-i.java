class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums2.length-1;
        int max=nums2[n];
        map.put(max,-1);
        for(int i=n-1;i>=0;i--){
            if(nums2[i]<max){
                for(int j=i+1;j<=n;j++){
                    if(nums2[i]<nums2[j]){
                        map.put(nums2[i],nums2[j]);
                        break;
                    }
                }
                
            }else{
                map.put(nums2[i],-1);
            }
            if(max<nums2[i]){
                    max=nums2[i];
                }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}