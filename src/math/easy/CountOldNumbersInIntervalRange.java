package math.easy;

public class CountOldNumbersInIntervalRange {
    public int countOdds(int low, int high) {
        return (high % 2 != 0 || low % 2 != 0 )? (high - low) / 2 + 1 : (high - low) / 2;
    }
}
