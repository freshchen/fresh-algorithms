/**
 * @program: fresh-algorithms
 * @Date: 2019/7/23 21:34
 * @Author: Ling Chen
 * @Description:
 */
public class Q200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int result = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    result++;
                    infect(grid, i, j);
                }
            }
        }
        return result;
    }

    private void infect(char[][] grid, int i, int j) {
        int row = grid.length;
        int column = grid[0].length;

        if (i < 0 || j < 0 || i >= row || j >= column || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = '0';
        infect(grid, i - 1, j);
        infect(grid, i + 1, j);
        infect(grid, i, j - 1);
        infect(grid, i, j + 1);

    }

}
