/**
 * @anthor LingChen
 * @create 4/16/2019 4:44 PM
 * @Description
 */
public class Q66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i >= 0;i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1, 23, 324, 543};
        Q66 q66 = new Q66();
        q66.plusOne(ints);
    }
}
