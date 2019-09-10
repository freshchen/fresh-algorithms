package sort;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/9/2019 1:08 PM
 * @Description
 */
public class Bubble {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        // 冒泡总次数
        for (int i = 1; i < len; i++) {
            boolean flag = true;
            // 每次冒泡过程
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    MyUtils.swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                // 如果一个冒泡过程没改变，退出返回已经有序
                break;
            }
        }
        return arr;
    }
}
