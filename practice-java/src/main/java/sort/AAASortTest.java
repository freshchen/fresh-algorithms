package sort;

import common.MyUtils;

import java.util.Arrays;

/**
 * @anthor LingChen
 * @create 9/9/2019 5:55 PM
 * @Description
 */
public class AAASortTest {

    public static boolean testSort(int[] arr) {
        int[] arrRight = MyUtils.getArr();
        Arrays.sort(arrRight);
        if (Arrays.equals(arr, arrRight)) {
            System.out.println("PASS");
            return true;
        } else {
            System.out.println("Right: " + Arrays.toString(arrRight));
            System.out.println("Yours: " + Arrays.toString(arr));
            return false;
        }

    }

    private static void text1() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 5; i++) {
            MyUtils.randomArray();
            if (!testSort(Merge.sort(MyUtils.getArr()))) {
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Run time ： " + (endTime - startTime) + "ns");
    }


    public static void main(String[] args) {
        AAASortTest.text1();
    }
}
