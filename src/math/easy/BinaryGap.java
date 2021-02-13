package math.easy;

public class BinaryGap {
    public int binaryGap(int n) {
        int difference = Integer.MIN_VALUE;
        int index = -1;
        int count = 1;
        while (n > 0){
            if (n % 2 != 0){
                if (index == -1){
                    index = count;
                    n /= 2;
                    count++;
                    continue;
                }
                difference = Math.max(difference,Math.abs(count - index));
                index = count;
            }
            n /= 2;
            count++;
        }
        return difference == Integer.MIN_VALUE ? 0 : difference;
    }
}
