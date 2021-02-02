package math.easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int n = nums.length;
        int actual = n * (n + 1) / 2;
        return actual - sum;
    }
}
