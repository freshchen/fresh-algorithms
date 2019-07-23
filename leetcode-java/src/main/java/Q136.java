import java.util.HashMap;
import java.util.Map;

/**
 * @anthor LingChen
 * @create 7/23/2019 2:27 PM
 * @Description
 */
public class Q136 {
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Q136.singleNumber(new int[]{1, 2, 3, 3, 1});
    }
}
