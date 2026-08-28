class Solution {
    public String minWindow(String s, String t) {
        int[] ar = new int[128];
        int[] ar2 = new int[128];

        for (char c : t.toCharArray()) {
            ar[c]++;
        }

        int len = t.length();
        String sp = "";
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ar2[c]++;

            if (ar[c] != 0 && ar2[c] <= ar[c]) {
                len--;
            }

            while (len == 0) {
                String st = s.substring(j, i + 1);

                if (sp.length() == 0 || st.length() < sp.length()) {
                    sp = st;
                }

                c = s.charAt(j++);
                ar2[c]--;

                if (ar[c] != 0 && ar2[c] < ar[c]) {
                    len++;
                }
            }
        }

        return sp;
    }
}