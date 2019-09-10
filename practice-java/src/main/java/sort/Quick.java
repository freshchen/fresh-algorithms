package sort;

/**
 * @anthor LingChen
 * @create 9/10/2019 1:55 PM
 * @Description
 */
public class Quick {

    // 基于荷兰国旗问题的快排
    public static int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int[] pIndexs = DutchFlag.partiton(arr, left, right);
            sort(arr, left, pIndexs[0]);
            sort(arr, pIndexs[1], right);
        }
    }
}
