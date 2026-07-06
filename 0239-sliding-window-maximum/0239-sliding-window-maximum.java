import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int p = 0;

        for (int i = 0; i < n; i++) {

            maxHeap.offer(nums[i]);

            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);

            int left = i - k + 1;

            if (i >= k - 1) {

               while (!maxHeap.isEmpty()) {

    int val = maxHeap.peek();
    ArrayList<Integer> list = map.get(val);

    if (list == null) {
        maxHeap.poll();
        continue;
    }

    while (!list.isEmpty() && list.get(0) < left) {
        list.remove(0);
    }

    if (list.isEmpty()) {
        map.remove(val);
        maxHeap.poll();
    } else {
        break;
    }
}

                ans[p++] = maxHeap.peek();
            }
        }

        return ans;
    }
}