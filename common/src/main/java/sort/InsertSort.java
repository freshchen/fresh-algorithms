package sort;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/8/15 20:09
 * @Author: Ling Chen
 * @Description:
 */
public class InsertSort {

    public static int[] sort(int[] sourceArray) throws Exception {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        for (int i = 1; i < length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != temp){
                array[j] = temp;
            }
        }
        return array;
    }
}
