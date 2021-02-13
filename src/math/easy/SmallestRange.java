package math.easy;

import java.util.Arrays;

public class SmallestRange {

    public int smallestRangeI(int[] A, int K) {
        return byOptimalSolution(A, K);
    }

    private int byOptimalSolution(int[] A, int K){
        int [] maxMin = findMaxMin(A);
        int max = maxMin[0];
        int min = maxMin[1];

        int minDiff = Integer.MAX_VALUE;

        for(int startIndex = min - K; startIndex <= min + K; startIndex++){
            for(int endIndex = max - K; endIndex <= max + K; endIndex++){
                minDiff = Math.min(minDiff, Math.abs(endIndex - startIndex));
            }
        }
        return minDiff;
    }

    private int[] findMaxMin(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int val : a){
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        return new int[]{max, min};
    }

    int bruteForce(int[] A, int K){
        if(A.length <= 1) return 0;
        Arrays.sort(A);
        int start = A[0];
        int end = A[A.length - 1];

        int min = Integer.MAX_VALUE;

        for(int startIndex = start - K; startIndex <= start + K; startIndex++){
            for(int endIndex = end - K; endIndex <= end + K; endIndex++){
                min = Math.min(min, Math.abs(endIndex - startIndex));
            }
        }
        return min;
    }
}
