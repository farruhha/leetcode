package math.easy;

import java.util.Set;

public class Hexspeak {
    public String toHexspeak(String num) {
        Set<Character> sets = Set.of('A', 'B', 'C', 'D', 'E', 'F', 'I', 'O');
        StringBuilder mutable
                = new StringBuilder(Long.toHexString(Long.parseLong(num)).toUpperCase());
        for (int index = 0; index < mutable.length(); index++){
            if (mutable.charAt(index) == '0'){
                mutable.setCharAt(index, 'O');
            }
            if (mutable.charAt(index) == '1'){
                mutable.setCharAt(index, 'I');
            }
            if (!sets.contains(mutable.charAt(index))) return "ERROR";
        }
        return mutable.toString();
    }
}
