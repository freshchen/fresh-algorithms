package sort;

import common.MyUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 21:56
 * @Author: Ling Chen
 * @Description:
 */
public class QuickTest {

    @Test
    public void sort() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Quick.sort(MyUtils.getArr())));
    }
}