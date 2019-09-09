package sort;

import common.IUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 2:48 PM
 * @Description
 */
public class Selection {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // ????
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            // ???????????
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                IUtils.swap(arr, i, min);
            }
        }
        return arr;
    }
}
