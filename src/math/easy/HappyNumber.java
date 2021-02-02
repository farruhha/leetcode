package math.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();

        while(n != 1){
            if(numbers.contains(n)){
                return false;
            }
            numbers.add(n);
            n = getDigits(n);
        }
        return true;
    }

    private int getDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
