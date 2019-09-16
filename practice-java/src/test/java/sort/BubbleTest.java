package sort;

import common.MyUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 21:41
 * @Author: Ling Chen
 * @Description:
 */
public class BubbleTest {

    @Test
    public void sort() {
        MyUtils.randomArray();
        assertTrue(AAASortTest.testSort(Bubble.sort(MyUtils.getArr())));
    }
}