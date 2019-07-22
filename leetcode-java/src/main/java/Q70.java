/**
 * @anthor LingChen
 * @create 7/22/2019 5:29 PM
 * @Description
 */
public class Q70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] result = new int[n + 1];
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        System.out.println(q70.climbStairs(3));
    }
}
