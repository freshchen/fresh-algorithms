package sort;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/8/15 19:41
 * @Author: Ling Chen
 * @Description:
 */
public class BubbleSort {

    public static int[] sort(int[] sourceArray) throws Exception{
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        for (int i = 0; i < length; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        return array;
    }
}
