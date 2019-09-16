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
public class SelectionTest {

    @Test
    public void sort() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Selection.sort(MyUtils.getArr())));
    }
}