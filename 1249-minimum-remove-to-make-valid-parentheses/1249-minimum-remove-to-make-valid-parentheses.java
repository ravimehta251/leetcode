import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        boolean[] remove = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    remove[i] = true;
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (!remove[i]) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}