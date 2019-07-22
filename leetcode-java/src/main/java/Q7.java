/**
 * @anthor LingChen
 * @create 4/12/2019 4:08 PM
 * @Description
 */
public class Q7 {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x)));
        sb.reverse();
        if (x < 0 ){
            sb.insert(0, "-");
        }
        try {
            int result = Integer.parseInt(sb.toString());
            return result;
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        Q7 q7 = new Q7();
        System.out.println(q7.reverse(123));
    }
}
