package math.easy;

import java.util.HashMap;
import java.util.Map;

public class XKindDeckCards {

    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2) return false;
        Map<Integer, Integer> memo = new HashMap<>();
        for(int num : deck){
            int count = memo.getOrDefault(num, 0);
            memo.put(num, count + 1);
        }

        int exact = memo.getOrDefault(deck[0], 0);
        for(Map.Entry<Integer, Integer> entry : memo.entrySet()){
            if (entry.getValue() < 2 || entry.getValue() != exact) return false;
        }

        return true;
    }
}
