package math.easy;

public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int area = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                area += getValue(row, col, grid);
            }
        }
        return area;
    }

    private int getValue(int row, int col, int[][] grid){
        int sum = 0;
        sum += (row - 1 < 0) ? grid[row][col] : ((grid[row - 1][col] < grid[row][col]) ? Math.abs(grid[row - 1][col] - grid[row][col]) : 0);
        sum += (row + 1 >= grid.length) ? grid[row][col] : ((grid[row + 1][col] < grid[row][col]) ? Math.abs(grid[row + 1][col] - grid[row][col]) : 0);
        sum += (col - 1 < 0) ? grid[row][col] : ((grid[row][col - 1] < grid[row][col]) ? Math.abs(grid[row][col - 1] - grid[row][col]) : 0);
        sum += (col + 1 >= grid[row].length) ? grid[row][col] : ((grid[row][col + 1] < grid[row][col]) ? Math.abs(grid[row][col + 1] - grid[row][col]) : 0);
        return sum + grid[row][col];
    }
}
