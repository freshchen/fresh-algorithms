package easy;

/**
 * @anthor LingChen
 * @create 4/12/2019 4:08 PM
 * @Description
 */
public class Ex7 {
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
        Ex7 ex7 = new Ex7();
        System.out.println(ex7.reverse(123));
    }
}
