import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>(); 
        int p = 0; long sum = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
          
            while (linkedHashSet.size() == k || linkedHashSet.contains(nums[i])) {
                linkedHashSet.remove(nums[p]);
                sum -= nums[p++];
            }
            
           
            sum += nums[i];
            linkedHashSet.add(nums[i]);
            
           
            if (linkedHashSet.size() == k) {
                max = Math.max(max, sum); 
            }
        }
        
        return max;
    }
}