package math.easy;

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
}
