import java.util.Arrays;

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum < 0 || sum > num * 9) {
            return "";
        }
        
        char[] su = new char[num];
        Arrays.fill(su, '0');
        
        int n9 = sum / 9;
        int rem = sum % 9;
        
        if (n9 > 0) {
            Arrays.fill(su, 0, n9, '9');
        }
        
        if (rem != 0 && n9 < num) {
            su[n9] = (char) (rem + '0');
        }
        
        return new String(su);
    }
}
