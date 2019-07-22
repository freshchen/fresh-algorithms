/**
 * @anthor LingChen
 * @create 7/22/2019 5:29 PM
 * @Description
 */
public class Q70 {
    public int climbStairs(int n) {
        int half = n / 2;
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= half; i++) {
            for (int j = 0; j <= n; j++) {
                sum = 2 * i + j;
                if (sum == n) {
                    count++;
                    sum = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        System.out.println(q70.climbStairs(3));
    }
}
