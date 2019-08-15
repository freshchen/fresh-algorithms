package sort;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/8/15 19:56
 * @Author: Ling Chen
 * @Description:
 */
public class SelectionSort {

    public int[] sort(int[] sourceArray) throws Exception{
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        for (int i = 0; i < length -1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[i]){
                    min = j;
                }
            }
            if (i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
