class Solution {
    public void sortColors(int[] nums) {
        int mid=0,start=0,end=nums.length-1;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                swap(nums, start,mid);
                start++ ; mid++ ;break;
                case 1: mid++; break;
                case 2: swap(nums,mid,end);  end--; break;

            }
        }
    }
    public void swap(int[] ar,int st,int en){
        int temp=ar[st];
        ar[st]=ar[en];
        ar[en]=temp;
    }
}