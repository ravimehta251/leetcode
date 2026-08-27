class Solution {
    public int maxArea(int[] height) {
        int max=0,i=0,j=height.length-1;
        while(i<j){
            int l=(j-i)*Math.min(height[i],height[j]);
            if(max<l){
                max=l;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}