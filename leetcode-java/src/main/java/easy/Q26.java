package easy;

/**
 * @anthor LingChen
 * @create 4/15/2019 3:05 PM
 * @Description
 */
public class Q26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Q26 q26 = new Q26();
        int result = q26.removeDuplicates(new int[]{1, 1, 1, 3, 3});
        System.out.println(result);
    }
}
