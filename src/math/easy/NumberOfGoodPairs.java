package math.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
       return byCounting(nums);
    }

    int solveByBruteForce(int [] nums){
        int goodPairs = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int y = i + 1; y < nums.length; y++){
                if(nums[i] == nums[y]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    private int byCounting(int[] nums) {
        Map<Integer, Integer> counting = new HashMap<>();

        for (int num : nums) {
            int count = counting.getOrDefault(num, 0);
            counting.put(num, count);
        }
        int result = 0;
        for (int count : counting.values()) {
            result += count * (count - 1) / 2;
        }
        return result;
    }
}
