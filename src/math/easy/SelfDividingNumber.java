package math.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<>();

        for (int number = left; number <= right; number++){
            if (isSelfDividing(number)){
                results.add(number);
            }
        }
        return results;
    }

    private boolean isSelfDividing(int number) {
        int originalDividend = number;
        while (number > 0){
            int divider = number % 10;
            if (divider == 0 || originalDividend % divider != 0){
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
