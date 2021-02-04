package math.easy;

public class CheckIfStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) return true;

        /**
         * According to this𝑦2−𝑦1/𝑥2−𝑥1=𝑦3−𝑦1/𝑥3−𝑥1
         * */

        for(int index = 1; index < coordinates.length - 1; index++){
            int x1 = coordinates[index - 1][0];
            int y1 = coordinates[index - 1][1];

            int x2 = coordinates[index][0];
            int y2 = coordinates[index][1];

            int x3 = coordinates[index + 1][0];
            int y3 = coordinates[index + 1][1];


            if ((x1- x2 == 0 || x1 - x3 == 0)){
               if(x1 - x2 != 0 || x1 - x3 != 0 || y1 - y2 != 0 || y1 - y3 != 0) return false;
            }
            if ((y2-y1)/(x2-x1) != (y3 - y1)/ (x3 - x1)) return false;
        }
        return true;
    }
}
