class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        long num = 0;

        // sign check
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // digit parsing
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // overflow check
            if (sign == 1 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * num);
    }
}
