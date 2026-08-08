import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            String x = String.valueOf(a);
            String y = String.valueOf(b);

            return (y + x).compareTo(x + y);
        });

        String p = "";

        for (int i = 0; i < arr.length; i++) {
            p = p + arr[i];
        }

  
        if (p.charAt(0) == '0') {
            return "0";
        }

        return p;
    }
}