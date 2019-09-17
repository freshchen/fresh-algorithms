package array.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @anthor LingChen
 * @create 9/17/2019 10:32 AM
 * @Description
 */
public class Lc200IslandsNumTest {

    Lc200IslandsNum lc200IslandsNum;


    @Before
    public void setUp() throws Exception {
        lc200IslandsNum = new Lc200IslandsNum();
    }

    @Test
    public void numIslands1() {
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
        Assert.assertEquals(lc200IslandsNum.numIslands(matrix), 2);
    }

    @Test
    public void numIslands2() {
        char[][] matrix = {
                {
                        '1', '0', '0', '0'
                },
                {
                        '1', '1', '1', '0'
                },
                {
                        '0', '0', '1', '1'
                }

        };
        Assert.assertEquals(lc200IslandsNum.numIslands(matrix), 1);
    }

    @Test
    public void numIslands3() {
        char[][] matrix = {
                {
                        '1', '0', '0', '0'
                },
                {
                        '0', '1', '1', '0'
                },
                {
                        '0', '0', '0', '1'
                }

        };
        Assert.assertEquals(lc200IslandsNum.numIslands(matrix), 3);
    }
}