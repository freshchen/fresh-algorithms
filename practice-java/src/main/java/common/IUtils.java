package common;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/8 23:02
 * @Author: Ling Chen
 * @Description:
 */
public class IUtils {

    private static int[] arr = null;

    public static void randomArray() {
        int size = 20;
        int maxValue = 20;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
        }
    }

    public static boolean testSort(int[] arr) {
        int[] arrRight = getArr();
        Arrays.sort(arrRight);
        if (Arrays.equals(arr, arrRight)){
            System.out.println("PASS");
            return true;
        }else {
            System.out.println("Right: " + Arrays.toString(arrRight));
            System.out.println("Yours: " + Arrays.toString(arr));
            return false;
        }

    }

    public static int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }


    public static void swap(int[] arr, int fromIndex, int toIndex) {
        int temp = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = temp;
    }


}
