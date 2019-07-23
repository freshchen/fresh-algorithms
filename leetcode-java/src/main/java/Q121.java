/**
 * @anthor LingChen
 * @create 7/23/2019 1:30 PM
 * @Description
 */
public class Q121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                result = (prices[j] - prices[i] > result) ? prices[j] - prices[i] : result;
            }
        }
        return result;
    }
}
