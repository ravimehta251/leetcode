class Solution {
    public int search(int[] nums) {
        int mid;
        int start=0, end=nums.length-1;
        while(start<end){
            mid=(start+end)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end ;
    }
    public int search1(int[] nums, int target, int start,int end) {
        int mid;
        
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int pivot=search(nums);
       

        if ( target <= nums[nums.length - 1]) {
            return search1(nums, target, pivot, nums.length - 1);
        } else {
            return search1(nums, target, 0, pivot - 1);
        }
        
    }
}