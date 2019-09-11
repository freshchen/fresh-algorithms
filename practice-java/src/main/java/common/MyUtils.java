package common;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/8 23:02
 * @Author: Ling Chen
 * @Description:
 */
public class MyUtils {

    private static int[] arr = null;
    private static int[][] matrix = null;

    public static void randomMatrix() {
        int size = 5;
        int maxValue = 20;
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
            }
        }
    }

    public static int[][] getMatrix() {
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return copy;
    }

    public static void prinMatrix(int[][] matrix) {
        System.out.println("Current matrix is :");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }

    public static void randomArray() {
        int size = 20;
        int maxValue = 20;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
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
