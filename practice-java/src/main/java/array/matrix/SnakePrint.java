package array.matrix;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/12/2019 10:09 AM
 * @Description 从左上角开始蛇形打印矩阵
 */
public class SnakePrint {

    public static void snakePrint(int[][] matrix) {
        // 向左移动，向下移动,右下角坐标
        int leftDownRaw = 0;
        int leftDownColume = 0;
        int DownRightRaw = 0;
        int DownRightColume = 0;
        int endRaw = matrix.length - 1;
        int endColume = matrix[0].length - 1;
        // 从上向下打印还是从下向上
        boolean flag = false;
        while (leftDownRaw <= endRaw) {
            printBetween(matrix, leftDownRaw, leftDownColume, DownRightRaw, DownRightColume, flag);
            // 先后顺序有讲究，反了的话对角线没了
            leftDownRaw = leftDownColume == endColume ? leftDownRaw + 1 : leftDownRaw;
            leftDownColume = leftDownColume == endColume ? leftDownColume : leftDownColume + 1;
            DownRightColume = DownRightRaw == endRaw ? DownRightColume + 1 : DownRightColume;
            DownRightRaw = DownRightRaw == endRaw ? DownRightRaw : DownRightRaw + 1;
            flag = !flag;
        }
    }

    public static void printBetween(int[][] matrix, int leftDownRaw, int leftDownColume, int DownRightRaw, int DownRightColume, boolean flag) {
        if (flag) {
            while (leftDownRaw <= DownRightRaw) {
                System.out.print(matrix[leftDownRaw++][leftDownColume--] + " ");
            }
        } else {
            while (DownRightColume <= leftDownColume) {
                System.out.print(matrix[DownRightRaw--][DownRightColume++] + " ");
            }
        }
    }


    public static void main(String[] args) {
        MyUtils.randomMatrix();
        int[][] matrix = MyUtils.genMatrix();
        MyUtils.prinMatrix(matrix);
        snakePrint(matrix);

    }
}
