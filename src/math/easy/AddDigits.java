package math.easy;

public class AddDigits {
    public int addDigits(int num) {
        while(num >= 10){
            num = getDigitSums(num);
        }
        return num;
    }

    private int getDigitSums(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
