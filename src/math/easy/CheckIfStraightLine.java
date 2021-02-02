package math.easy;

public class CheckIfStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) return true;

        for(int index = 1; index < coordinates.length - 1; index++){
            if(!(Math.abs(coordinates[index - 1][0] - coordinates[index][0])
                    == Math.abs(coordinates[index][0] - coordinates[index + 1][0])
                    && Math.abs(coordinates[index - 1][1] - coordinates[index][1])
                    == (Math.abs(coordinates[index][1] - coordinates[index + 1][1])))){
                return false;
            }
        }
        return true;
    }
}
