class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> nums[b] - nums[a]
        );

        int[] ar = new int[nums.length - k + 1];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            pq.add(i);

            if (i >= k - 1) {
                while (pq.peek() <= i - k) {
                    pq.poll();
                }

                ar[j++] = nums[pq.peek()];
            }
        }

        return ar;
    }
}