class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length-1;i++){
           map.put(nums2[i],i);  
        }
        map.put(nums2[nums2.length-1],-1);
        for(int i=0;i<nums1.length;i++){
            int idx=map.get(nums1[i]);
            if(idx==-1){
                nums1[i]=-1;
            }else{
                boolean b=false;
                for(int j=idx+1;j<nums2.length;j++){
                     if(nums2[idx]<nums2[j]){
                        nums1[i]=nums2[j];
                        b=true;
                        break;
                     }
                }
                if(!b){
                    nums1[i]=-1;
                }
            }
        }
        return nums1;

        
    }
}