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
        String stringNumber = String.valueOf(number);
        for(int index = 0; index < stringNumber.length(); index++){
            int digit = Character.getNumericValue(stringNumber.charAt(index));
            if (digit == 0) return false;
            if (number % digit != 0) return false;
        }
        return true;
    }
}
