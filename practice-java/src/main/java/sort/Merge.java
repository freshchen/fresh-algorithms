package sort;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/9 20:48
 * @Author: Ling Chen
 * @Description:
 */
public class Merge {

    public static int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        // 等同于(right + left)/2
        int mid = left + ((right - left) >> 1);
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        // 已经分成了许多小份，开始合并
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        // 左边右边通过辅助数组合并
        while (p1 <= mid && p2 <= right) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 左边没空加到后面
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        // 右边没空加到后面
        while (p2 <= right) {
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[left + j] = help[j];
        }

    }

}
