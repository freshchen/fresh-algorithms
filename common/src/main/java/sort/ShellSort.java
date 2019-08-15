package sort;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/8/15 21:11
 * @Author: Ling Chen
 * @Description:
 */
public class ShellSort {
    public int[] sort(int[] sourceArray) throws Exception {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        int gap = 1;
        while (gap < length){
            gap = gap * 3 + 1;
        }
        while (gap > 0){
            for (int i = gap; i < length; i++) {
                int temp = array[i];
                int j = i - gap;
                while (j >= 0 && array[j] > temp){
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] =temp;
            }
            gap = (int) Math.floor(gap / 3);
        }
        return array;
    }
}
