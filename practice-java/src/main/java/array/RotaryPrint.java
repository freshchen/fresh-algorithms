package array;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/11/2019 4:53 PM
 * @Description 顺时针旋转打印一个矩阵
 */
public class RotaryPrint {

    public static void rotaryPrint(int[][] matrix) {
        int raw = matrix.length - 1;
        int colume = matrix[0].length - 1;
        int[] leftHead = new int[]{0, 0};
        int[] rightTail = new int[]{raw, colume};
        while (raw > 0 && colume > 0) {
            rotaring(matrix, leftHead, rightTail);
            leftHead[0]++;
            leftHead[1]++;
            rightTail[0]--;
            rightTail[1]--;
            raw--;
            colume--;
        }

    }

    public static void rotaring(int[][] matrix, int[] leftHead, int[] rightTail) {
        int leftHeadRow = leftHead[0];
        int leftHeadColume = leftHead[1];
        int rightTailRow = rightTail[0];
        int rightTailColume = rightTail[1];
        if (leftHeadRow == rightTailRow) {
            // 左上角右下角同一行
            while (leftHeadColume <= rightTailColume) {
                System.out.print(matrix[leftHeadRow][leftHeadColume++] + " ");
            }
        } else if (leftHeadColume == rightTailColume) {
            // 左上角右下角同一列
            while (leftHeadRow <= rightTailRow) {
                System.out.print(matrix[leftHeadRow++][leftHeadColume] + " ");
            }
        } else {
            while (leftHeadColume < rightTailColume) {
                System.out.print(matrix[leftHeadRow][leftHeadColume++] + " ");
            }
            while (leftHeadRow < rightTailRow) {
                System.out.print(matrix[leftHeadRow++][rightTailColume] + " ");
            }
            while (rightTailColume > leftHead[1]) {
                System.out.print(matrix[rightTail[1]][rightTailColume--] + " ");
            }
            while (rightTailRow > leftHead[0]) {
                System.out.print(matrix[rightTailRow--][leftHead[0]] + " ");
            }
        }

    }

    public static void main(String[] args) {
        MyUtils.randomMatrix();
        int[][] matrix = MyUtils.getMatrix();
        MyUtils.prinMatrix(matrix);
        rotaryPrint(matrix);

    }
}
