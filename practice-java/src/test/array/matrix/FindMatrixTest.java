package array.matrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 22:29
 * @Author: Ling Chen
 * @Description:
 */
public class FindMatrixTest {

    @Test
    public void findNum() {
        int[][] matrix = {
                {
                        1, 3, 5, 7
                },
                {
                        9, 11, 13, 15
                },
                {
                        17, 19, 21, 23
                }

        };
        Assert.assertArrayEquals(FindMatrix.findNum(matrix, 21), new int[]{2, 2});
    }
}