package math.easy;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        if(S.length() == 0) return new int[]{};
        int min = 0;
        int max = S.length();
        int [] result = new int[max+1];
        int index = 0;
        while(min < max){
            if(S.charAt(index) == 'I'){
                result[index++] = min;
                ++min;
            }else{
                result[index++] = max;
                --max;
            }
        }
        result[index] = min;
        return result;
    }
}
