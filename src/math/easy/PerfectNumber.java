package math.easy;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        return optimal(num);
    }

    private boolean optimal(int num){
        Set<Integer> perfectNumbers = Set.of(6, 28, 496, 8128, 33550336);
        return perfectNumbers.contains(num);
    }

    private boolean bruteForce(int num){
        int sum = 1;
        for (int number = 2; number <= num / 2; number++){
            if (num  % number == 0){
                sum += number;
            }
        }
        return sum == num;
    }
}
