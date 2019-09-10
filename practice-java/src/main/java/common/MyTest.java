package common;

import sort.DutchFlag;
import sort.Heap;
import sort.Merge;
import sort.Quick;

/**
 * @anthor LingChen
 * @create 9/9/2019 5:55 PM
 * @Description
 */
public class MyTest {

    private static void text1() {
        for (int i = 0; i < 5; i++) {
            MyUtils.randomArray();
            if (!MyUtils.testSort(Heap.sort(MyUtils.getArr()))) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        MyTest.text1();
    }
}
