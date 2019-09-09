package sort;

import common.IUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 1:08 PM
 * @Description
 */
public class Bubble {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // ???????????
        for (int i = 1; i < len; i++) {
            boolean flag = true;
            // ????????
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    IUtils.swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                // ??????????????
                break;
            }
        }
        return arr;
    }
}
