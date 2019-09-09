package common;

import sort.Merge;

/**
 * @anthor LingChen
 * @create 9/9/2019 5:55 PM
 * @Description
 */
public class ITest {

    private static void text1() {
        for (int i = 0; i < 5; i++) {
            IUtils.randomArray();
            if (!IUtils.testSort(Merge.sort(IUtils.getArr()))) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        ITest.text1();
    }
}
