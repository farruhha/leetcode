package math.easy;

import java.util.HashMap;
import java.util.Map;

public class MinimumCostToMoveChipsToSamePosition {

    public int minCostToMoveChips(int[] position) {
        int minCost = Integer.MAX_VALUE;
        for(int index = 0; index < position.length; index++){
            int cost = findMinCost(index, position);
            minCost = Math.min(cost, minCost);
        }
        return minCost;
    }

    private int findMinCost(int index, int[]positions){
        int cost = 0;

        for (int i : positions) {
            if (i == positions[index]) continue;
            cost += Math.abs(positions[index] - i) % 2;
        }
        return cost;
    }

    private int optimal(int[] positions){
        Map<Integer, Integer> positionCount = new HashMap<>();

        for(int position : positions){
            int count = positionCount.getOrDefault(position, 0);
            positionCount.put(position, count + 1);
        }

        Integer [] pos = positionCount.keySet().toArray(new Integer[]{});
        int min = Integer.MAX_VALUE;

        for (int p : pos){
            int cost = findCost(p, pos, positionCount);
            min = Math.min(cost, min);
        }
        return min;
    }

    int findCost(int value, Integer [] positions, Map<Integer,Integer> memos){
        int cost = 0;

        for (int pos : positions){
            if (pos == value) continue;
            cost += (Math.abs(value - pos) % 2) * memos.get(pos);
        }
        return cost;
    }
}
