package math.easy;

import java.util.Map;

public class ConfusingNumber {

    public boolean confusingNumber(int N) {
        if(N == 0) return false;
        Map<Integer, Integer> numbers =
                Map.of(1, 1, 8, 8, 6, 9, 0, 0, 9, 6);
        StringBuilder number = new StringBuilder();

        int original = N;
        while (N > 0){
            int digit = N % 10;
            if (!numbers.containsKey(digit)) return false;
            number.append(numbers.get(digit));
            N /= 10;
        }

        System.out.println(number.toString());

        return Integer.parseInt(number.toString()) != original;
    }
}
