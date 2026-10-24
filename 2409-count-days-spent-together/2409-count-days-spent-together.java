class Solution {
    public int dayc(String s) {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m = Integer.parseInt(s.substring(0, 2));
        int d = Integer.parseInt(s.substring(3, 5));

        int day = 0;
        for (int i = 0; i < m - 1; i++) {
            day += month[i];
        }

        return day + d;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int start = Math.max(dayc(arriveAlice), dayc(arriveBob));
        int end = Math.min(dayc(leaveAlice), dayc(leaveBob));

        return Math.max(0, end - start + 1);
    }
}