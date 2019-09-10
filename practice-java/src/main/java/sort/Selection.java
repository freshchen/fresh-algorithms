package sort;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 2:48 PM
 * @Description
 */
public class Selection {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // 选择次数
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            // 每次选择过程
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                MyUtils.swap(arr, i, min);
            }
        }
        return arr;
    }
}
