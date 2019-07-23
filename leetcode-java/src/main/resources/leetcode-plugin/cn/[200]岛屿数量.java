//给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。 
//
// 示例 1: 
//
// 输入:
//11110
//11010
//11000
//00000
//
//输出: 1
// 
//
// 示例 2: 
//
// 输入:
//11000
//11000
//00100
//00011
//
//输出: 3
// 
//

class Solution {
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