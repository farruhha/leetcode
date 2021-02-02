package math.easy;

public class PerformStringShift {
    public String stringShift(String s, int[][] shift) {
        int left = 0;
        int right = 0;

        for (int[] ints : shift) {
            left += ints[0] == 0 ? ints[1] : 0;
            right += ints[0] == 1 ? ints[1] : 0;
        }

        int difference = Math.abs(left - right) % s.length();
        if(difference == 0) return s;
        if (left > right){
            String sub = s.substring(0, difference);
            String nextHaft = s.substring(difference);
            return nextHaft + sub;
        }else{
            String sub = s.substring(s.length() - difference);
            String next = s.substring(0, s.length() - difference);
            return sub + next;
        }
    }
}
