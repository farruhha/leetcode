package math.easy;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        Set<Integer> sets = new HashSet<>();
        int duplicate = -1;
        for(int index = 0; index < nums.length; index++){
            if(!sets.contains(nums[index])){
                sum += nums[index];
                sets.add(nums[index]);
            }else{
                duplicate = nums[index];
            }
        }

        int actualSize = nums.length * (nums.length + 1 ) / 2;
        return new int []{duplicate, actualSize - sum};
    }
}
