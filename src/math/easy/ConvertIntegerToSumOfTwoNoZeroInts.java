package math.easy;

public class ConvertIntegerToSumOfTwoNoZeroInts {
    public int[] getNoZeroIntegers(int n) {
        int increment = 1;
        while(n > 0){
            int diff = n - increment;
            if(isNoZero(increment) && isNoZero(diff)) return new int[]{increment, diff};
            increment++;
        }

        return new int[]{0,0};
    }

    private boolean isNoZero(int number){
        while(number > 0){
            if(number % 10 == 0) return false;
            number /= 10;
        }
        return true;
    }
}
