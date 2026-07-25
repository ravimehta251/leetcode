import java.util.*;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> ar = new ArrayList<>();
        for (int num : nums) {
            if (ar.isEmpty() || ar.get(ar.size() - 1) != num) {
                ar.add(num);
            }
        }

        HashSet<Integer> pair = new HashSet<>();

        int m = ar.size();

        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                pair.add(ar.get(i) ^ ar.get(j));
            }
        }

        HashSet<Integer> ans = new HashSet<>();

        for (int x : pair) {
            for (int v : ar) {
                ans.add(x ^ v);
            }
        }

        return ans.size();
    }
}