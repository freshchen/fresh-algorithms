/**
 * @anthor LingChen
 * @create 4/15/2019 4:47 PM
 * @Description
 */
public class Q35 {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        } else if (nums[nums.length - 1] < target) {
            result = nums.length;
            return result;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    result = i;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q35 q35 = new Q35();
        System.out.println(q35.searchInsert(new int[]{1, 2, 3, 4, 4, 4, 5, 6,}, 7));
    }
}
