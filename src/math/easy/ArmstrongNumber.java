package math.easy;

public class ArmstrongNumber {
    public boolean isArmstrong(int N) {
        int originalNumber = N;
        int length = String.valueOf(N).length();
        int sum = 0;
        while(N >0){
            int digit = N % 10;
            sum += Math.pow(digit, length);
            N /=10;
        }
        return sum == originalNumber;
    }
}
