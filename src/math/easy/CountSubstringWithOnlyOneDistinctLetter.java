package math.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountSubstringWithOnlyOneDistinctLetter {
    public int countLetters(String S) {
        if(S.length() <= 1) S.length();
        int count = 1;
        int result = 0;
        for(int index = 1; index < S.length(); index++){
            if(S.charAt(index - 1) != S.charAt(index)){
                result += count * (count + 1) / 2;
                count = 0;
            }
            count++;
        }
        result += count * (count + 1) / 2;
        return result;
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> balls = new HashMap<>();
        for(int ball = lowLimit; ball <= highLimit; ball++){
            int box = getBall(lowLimit);
            int count = balls.getOrDefault(box, 0);
            balls.put(ball, count + 1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> entry: balls.entrySet()){
            max = Math.max(entry.getValue(), max);
        }

        return max;
    }

    private int getBall(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
