package sort;

import common.IUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 3:13 PM
 * @Description
 */
public class Insert {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // ?????left????????
        for (int left = 1; left < len; left++) {
            int temp = arr[left];
            int right = left - 1;
            // right?????????????temp???
            while (right >= 0 && temp < arr[right]) {
                arr[right + 1] = arr[right];
                right--;
            }
            // ??????????
            if (right != left - 1) {
                arr[right + 1] = temp;
            }

        }
        return arr;
    }

    public static int[] sort1(int[] arr) {
        int len = arr.length;
        // ?????left????????
        for (int left = 1; left < len; left++) {
            for (int right = left - 1; right >= 0 && arr[right] > arr[right + 1]; right--) {
                IUtils.swap(arr, right, right + 1);
            }
        }
        return arr;
    }

}
