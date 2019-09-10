package sort;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/10/2019 10:48 AM
 * @Description
 */
public class DutchFlag {

    public static int[] sort(int[] arr) {
        partiton(arr, 0, arr.length - 1);
        return arr;
    }

    public static int[] partiton(int[] arr, int left, int right) {
        int less = left - 1;
        int more = right + 1;
        int pNum = arr[right];
        while (left < more) {
            if (arr[left] < pNum) {
                MyUtils.swap(arr, ++less, left++);
            } else if (arr[left] > pNum) {
                MyUtils.swap(arr, --more, left);
            } else {
                left++;
            }
        }
        return new int[]{less, more};
    }

}
