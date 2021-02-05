package math.easy;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        Set<Integer> sets = new HashSet<>();
        int duplicate = -1;
        for (int num : nums) {
            if (!sets.contains(num)) {
                sum += num;
                sets.add(num);
            } else {
                duplicate = num;
            }
        }

        int actualSize = nums.length * (nums.length + 1 ) / 2;
        return new int []{duplicate, actualSize - sum};
    }
}
