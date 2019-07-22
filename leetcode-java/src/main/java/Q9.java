/**
 * @anthor LingChen
 * @create 4/12/2019 5:46 PM
 * @Description
 */
public class Q9 {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String oldValue = sb.toString();
        String newValue = sb.reverse().toString();
        if (oldValue.equals(newValue)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Q9 q9 = new Q9();
        q9.isPalindrome(222);
    }
}
