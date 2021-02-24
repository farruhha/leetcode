package arrays.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt((int[] sum) -> Arrays.stream(sum).sum()).max().getAsInt();
    }
}
