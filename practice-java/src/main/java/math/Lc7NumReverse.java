package math;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/17 21:08
 * @Author: Ling Chen
 * @Description: //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * //
 * // 示例 1:
 * //
 * // 输入: 123
 * //输出: 321
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: -123
 * //输出: -321
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: 120
 * //输出: 21
 * //
 * //
 * // 注意:
 * //
 * // 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * //
 */
public class Lc7NumReverse {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.reverse();
        if (x < 0) {
            sb.insert(0, "-");
        }
        try {
            int result = Integer.parseInt(sb.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
