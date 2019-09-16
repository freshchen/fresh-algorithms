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
public class MergeTest {

    @Test
    public void sort() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Merge.sort(MyUtils.getArr())));
    }
}