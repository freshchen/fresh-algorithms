package sort;

import common.MyUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 21:55
 * @Author: Ling Chen
 * @Description:
 */
public class InsertTest {

    @Test
    public void sort() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Insert.sort(MyUtils.getArr())));
    }

    @Test
    public void sort1() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Insert.sort1(MyUtils.getArr())));
    }
}