/**
 * @program: fresh-algorithms
 * @Date: 2019/7/23 20:29
 * @Author: Ling Chen
 * @Description:
 */
public class Q198 {

    public int rob(int[] nums) {
        int currentMax = 0;
        int result = 0;
        for (int x: nums) {
            int temp = result;
            result = Math.max(currentMax + x, result);
            currentMax = temp;
        }
        return result;
    }
}
