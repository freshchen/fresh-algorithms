package sort;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 3:13 PM
 * @Description
 */
public class Insert {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // 插入次数，left为未有序的左边
        for (int left = 1; left < len; left++) {
            int temp = arr[left];
            int right = left - 1;
            // right为有序部分的右边
            while (right >= 0 && temp < arr[right]) {
                arr[right + 1] = arr[right];
                right--;
            }
            // 判断是否需要插入
            if (right != left - 1) {
                arr[right + 1] = temp;
            }

        }
        return arr;
    }

    public static int[] sort1(int[] arr) {
        int len = arr.length;
        for (int left = 1; left < len; left++) {
            for (int right = left - 1; right >= 0 && arr[right] > arr[right + 1]; right--) {
                MyUtils.swap(arr, right, right + 1);
            }
        }
        return arr;
    }

}
