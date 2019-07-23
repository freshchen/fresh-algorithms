/**
 * @program: fresh-algorithms
 * @Date: 2019/7/23 21:34
 * @Author: Ling Chen
 * @Description:
 */
public class Q200 {
    public int numIslands(char[][] grid) {
        int result = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i - 1 < 0) grid[i - 1][j] = 0;
                if (i + 1 == row) grid[i + 1][j] = 0;
                if (j - 1 < 0) grid[i][j - 1] = 0;
                if (j + 1 < column) grid[i][j + 1] = 0;
                if ((grid[i][j] == 1) && (grid[i + 1][j] == 1) && (grid[i][j + 1] == 1)) {
                    grid[i][j] = 0;
                }
                if ((grid[i][j] == 1) && (grid[i - 1][j] == 0) && (grid[i + 1][j] == 0) && (grid[i][j - 1] == 0) && (grid[i][j + 1] == 0)) {
                    result++;
                }
            }
        }
        return result;
    }
}
