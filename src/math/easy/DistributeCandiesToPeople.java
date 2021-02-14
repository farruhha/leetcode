package math.easy;

public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {

        int [] candyDist = new int[num_people];
        int candyCount = 1;

        while(candyCount <= candies){
            candyDist[(candyCount - 1) % num_people] += candyCount;
            candies -= candyCount;
            ++candyCount;
        }

        candyDist[(candyCount - 1) % num_people] += candies;
        return candyDist;

    }
}
