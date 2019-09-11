package array;

import common.MyUtils;

import java.util.Arrays;

/**
 * @anthor LingChen
 * @create 9/11/2019 4:53 PM
 * @Description 顺时针旋转打印一个矩阵
 */
public class RotaryPrint {

    public static void rotaring(int[][] matrix, int[] leftHead, int[] rightTail) {
        int leftHeadRow = leftHead[0];
        int leftHeadColume = leftHead[1];
        int rightTailRow = rightTail[0];
        int rightTailColume = rightTail[1];
        if (leftHeadRow == rightTailRow) {
            while (leftHeadColume <= rightTailColume){
                System.out.println(matrix[leftHeadRow][leftHeadColume++]);
            }
        }

    }

    public static void main(String[] args) {
        MyUtils.randomMatrix();
        MyUtils.prinMatrix(MyUtils.getMatrix());

    }
}
