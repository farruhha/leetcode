package math.easy;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(new ArrangingCoins().arrangeCoins(1804289383));
    }
    public int arrangeCoins(int n) {
        return optimalSolution(n);
    }

    private int optimalSolution(int n){
        return (int)(-1+ Math.sqrt(1+8* (long) n))/2;
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
