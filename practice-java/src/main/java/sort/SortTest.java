package sort;

import common.IUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 5:55 PM
 * @Description
 */
public class SortTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            IUtils.randomArray();
            if ( ! IUtils.testSort(Bubble.sort(IUtils.getArr()))){
                break;
            }
        }
    }
}
