package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithSmallestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandy = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        Arrays.stream(candies).forEach((candy)-> result.add((candy + extraCandies) >= greatestCandy));
        return result;
    }

}
