class Solution {
    public String decodeString(String s) {

        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();

        StringBuilder str = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {

            // If current character is a digit
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            }

            // Opening bracket
            else if (c == '[') {
                strStack.push(str);
                numStack.push(num);

                str = new StringBuilder();
                num = 0;
            }

            // Closing bracket
            else if (c == ']') {
                StringBuilder temp = str;
                str = strStack.pop();

                int count = numStack.pop();

                while (count-- > 0) {
                    str.append(temp);
                }
            }

            // Alphabet
            else {
                str.append(c);
            }
        }

        return str.toString();
    }
}