package sort;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/10/2019 3:35 PM
 * @Description
 */
public class Heap {

    public static int[] sort(int[] arr) {
        int len = arr.length;
        buildBigHeap(arr, len);
        while (len > 0) {
            MyUtils.swap(arr, 0, --len);
            heapify(arr, 0, len);
        }

        return arr;
    }

    // 建立大根堆
    public static void buildBigHeap(int[] arr, int len) {
        for (int index = 0; index < arr.length; index++) {
            while (arr[index] > arr[(index - 1) / 2]) {
                MyUtils.swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }
    }

    // 调整堆
    private static void heapify(int[] arr, int currRoot, int len) {
        int left = currRoot * 2 + 1;
        int right = currRoot * 2 + 2;

        while (left < len) {
            int largest = right < len && arr[left] < arr[right] ? right : left;
            largest = arr[largest] > arr[currRoot] ? largest : currRoot;
            if (largest == currRoot) {
                break;
            }
            MyUtils.swap(arr, currRoot, largest);
            currRoot = largest;
            left = currRoot * 2 + 1;
            right = currRoot * 2 + 2;
        }

    }
}
