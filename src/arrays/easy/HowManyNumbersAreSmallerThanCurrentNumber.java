package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] copy = copy(nums);
        Arrays.sort(copy);

        Map<Integer, Integer> memo = new HashMap<>();

        for (int length = copy.length - 1; length >= 0; length--){
            if (!memo.containsKey(copy[length])){
                memo.put(copy[length], length);
            }
        }
        int index = 0;
        for (int num : nums){
            nums[index] = memo.get(nums[index]);
        }

        return nums;
    }

    private int[] copy(int[] nums) {
        int [] copy = new int[nums.length];
        int index = 0;
        for (int num : nums){
            copy[index++] = num;
        }
        return copy;
    }
}
