package math.easy;

public class ProjectionAreaOf3D {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] > 0) sum++;
            }
        }

        for(int index = 0; index < grid.length; index++){
            sum += findMax(index, grid);
        }

        return sum;
    }


    private int findMax(int index, int[][] grid){
        int maxH = Integer.MIN_VALUE;
        int maxV = Integer.MIN_VALUE;

        for(int move = 0; move < grid.length; move++){
            maxH = Math.max(maxH, grid[index][move]);
            maxV = Math.max(maxV, grid[move][index]);
        }

        return maxH + maxV;
    }
}
