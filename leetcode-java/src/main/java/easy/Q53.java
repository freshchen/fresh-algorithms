package easy;

/**
 * @anthor LingChen
 * @create 4/16/2019 3:06 PM
 * @Description
 */
public class Q53 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
