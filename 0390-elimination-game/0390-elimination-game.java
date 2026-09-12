class Solution {
    public int lastRemaining(int n) {

        int head = 1;
        int step = 1;
        int remaining = n;
        boolean leftToRight = true;

        while (remaining > 1) {

            // Head changes if:
            // 1. We go left -> right
            // 2. We go right -> left and count is odd
            if (leftToRight || remaining % 2 == 1) {
                head += step;
            }

            // Half the numbers are removed
            remaining /= 2;

            // Distance between numbers doubles
            step *= 2;

            // Change direction
            leftToRight = !leftToRight;
        }

        return head;
    }
}