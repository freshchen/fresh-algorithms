/**
 * @anthor LingChen
 * @create 4/12/2019 3:36 PM
 * @Description
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
        }
        return result;
    }

    public static void main(String[] args) {
        Q1 twoSum = new Q1();
        int[] nums = new int[]{4, 2, 6};
        int target = 10;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
