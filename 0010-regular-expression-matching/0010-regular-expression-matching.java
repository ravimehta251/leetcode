class Solution {

    public boolean is(String s, String p, int i, int j) {

        if (i == s.length() && j == p.length()) {
            return true;
        }

        if (j == p.length()) {
            return false;
        }

        boolean b = false;

        // Current character matches
        if (i < s.length() &&
            (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {

            b = is(s, p, i + 1, j + 1);
        }

        boolean a = false;
        boolean c = false;

        // '*' comes after current pattern character
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Don't use current character*
            a = is(s, p, i, j + 2);

            // Use current character* to match one character
            if (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {

                c = is(s, p, i + 1, j);
            }
        }

        return a || b || c;
    }

    public boolean isMatch(String s, String p) {
        return is(s, p, 0, 0);
    }
}