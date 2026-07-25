import java.util.*;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> pair = new HashSet<>();

        
        int m=nums.length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                pair.add(nums[i] ^ nums[j]);
            }
        }

        HashSet<Integer> ans = new HashSet<>();

        for (int x : pair) {
            for (int v : nums) {
                ans.add(x ^ v);
            }
        }

        return ans.size();
    }
}