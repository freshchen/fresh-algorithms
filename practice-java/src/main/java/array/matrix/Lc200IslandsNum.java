package array.matrix;

/**
 * @anthor LingChen
 * @create 9/16/2019 5:10 PM
 * @Description 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * <p>
 * 输出: 3
 *
 * {@link tree.union.IslandsNumParallel} 并行计算方法
 */
public class Lc200IslandsNum {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int result = 0;
        // 遍历矩阵，遇到1就开始感染周围的1变成0
        for (int raw = 0; raw < grid.length; raw++) {
            for (int colume = 0; colume < grid[0].length; colume++) {
                if (grid[raw][colume] == '1') {
                    infect(grid, raw, colume);
                    result++;
                }
            }
        }
        return result;
    }

    public void infect(char[][] grid, int raw, int colume) {
        if (raw < 0 || colume < 0 || raw >= grid.length || colume >= grid[0].length || grid[raw][colume] == '0') {
            return;
        }
        grid[raw][colume] = '0';
        infect(grid, raw + 1, colume);
        infect(grid, raw - 1, colume);
        infect(grid, raw, colume + 1);
        infect(grid, raw, colume - 1);
    }

    public static void main(String[] args) {
        Lc200IslandsNum lc200IslandsNum = new Lc200IslandsNum();
        char[][] matrix = {
                {
                        '1', '0', '0', '0'
                },
                {
                        '0', '1', '1', '0'
                },
                {
                        '0', '0', '1', '1'
                }

        };
        System.out.println(lc200IslandsNum.numIslands(matrix));
    }
}
