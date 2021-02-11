package math.easy;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return bruteForce(n);
    }

    private int bruteForce(int n){
        int nextStepCount = 1;
        int steps = 0;
        while(nextStepCount <= n){
            steps++;
            n -= nextStepCount;
            ++nextStepCount;
        }

        return steps;
    }

}
