class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            heap.add(nums[i]);
            if(k<heap.size()){
                heap.poll();
            }
        }
        return heap.peek();
    }
}