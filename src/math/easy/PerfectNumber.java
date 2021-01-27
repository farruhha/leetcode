package math.easy;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int number = 2; number <= num / 2; number++){
            if (num  % number == 0){
                sum += number;
            }
        }
        return sum == num;
    }
}
