class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] maxleft=new int[n];
        int[] maxright=new int[n];
        int ml=0,mr=0;
        for(int i=0;i<n;i++){
            maxleft[i]=ml;
            if(ml<height[i]){
                ml=height[i];
            }
            maxright[n-i-1]=mr;
            if(mr<height[n-i-1]){
                mr=height[n-i-1];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int k=Math.min(maxleft[i],maxright[i])-height[i];
            if(0<k){
                sum+=k;
            }
        }
        return sum;
    }
}