package math.easy;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        return byBruteForce(n);
    }
    private boolean byBruteForce(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
