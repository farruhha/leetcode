package math.easy;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = Math.min(nums.length, 6);
        int[] numbers = new int[length];
        numbers[0] = nums[0];
        numbers[1] = nums[1];
        numbers[2] = nums[2];
        numbers[length - 1] = nums[nums.length - 1];
        numbers[length - 2] = nums[nums.length - 2];
        numbers[length - 3] = nums[nums.length - 3];

        return findMax(numbers);
    }

    private int findMax(int[] numbers){
        int max = numbers[0] * numbers[1] * numbers[2];
        for(int index = 0; index < numbers.length - 2; index++){
            for(int x = index + 1; x < numbers.length - 1; x++){
                for(int y = x + 1; y < numbers.length; y++){
                    max = Math.max(numbers[index] * numbers[x]*numbers[y], max);
                }
            }
        }
        return max;
    }
}
