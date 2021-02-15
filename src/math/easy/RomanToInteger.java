package math.easy;

import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> maps = Map.of(
                'I',1,
                'V', 5,
                'X',10,
                'L', 50,
                'C',100,
                'D', 500,
                'M', 1000);
        int sum = maps.get(s.charAt(s.length() - 1));
        for (int index = s.length() - 2; index >= 0; index--){
            if(maps.get(s.charAt(index + 1)) > maps.get(s.charAt(index))){
                sum -= maps.get(s.charAt(index));
            }else sum += maps.get(s.charAt(index));
        }

        return sum;
    }
}
