import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store prefix sum frequency
        Map<Integer, Integer> map = new HashMap<>();
        
        // Important: base case
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Check if (sum - k) exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store/update current sum frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}