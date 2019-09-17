package array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @anthor LingChen
 * @create 9/17/2019 1:39 PM
 * @Description
 */
public class Lc1TwoNumSumTest {

    @Test
    public void twoSum() {
        int[] num = new int[]{2, 7, 11, 43};
        Assert.assertArrayEquals(new Lc1TwoNumSum().twoSum(num, 13), new int[]{0, 2});
    }
}