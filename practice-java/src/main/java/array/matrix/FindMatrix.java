package array.matrix;

import common.MyUtils;

/**
 * @anthor LingChen
 * @create 9/12/2019 2:31 PM
 * @Description 在一个行列都有序的矩阵中如何快速找出指定数
 */
public class FindMatrix {

    public static int[] findNum(int[][] matrix, int num) {
        // 从第一行最后开始找
        int beginRaw = 0, beginColume = matrix[0].length - 1;
        boolean flag = false;
        while (beginRaw < matrix.length || beginColume > 0) {
            int curr = matrix[beginRaw][beginColume];
            if (curr == num) {
                flag = true;
                break;
            } else if (curr > num) {
                beginColume--;
            } else {
                beginRaw++;
            }
        }
        if (!flag) {
            return new int[]{-1, -1};
        } else {
            return new int[]{beginRaw, beginColume};
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {
                        1, 3, 5, 7
                },
                {
                        9, 11, 13, 15
                },
                {
                        17, 19, 21, 23
                }

        };
        MyUtils.printArr(FindMatrix.findNum(matrix, 21));
    }
}
