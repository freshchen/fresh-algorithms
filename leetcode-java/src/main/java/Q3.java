import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @anthor LingChen
 * @create 7/22/2019 3:29 PM
 * @Description
 */
public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
            int flag = 0;
            int length = 0;
            int result = 0;
            while (i < s.length()) {
                int pos = s.indexOf(s.charAt(i), flag);
                if (pos < i) {
                    if (length > result) {
                        result = length;
                    }
                    if (result >= s.length() - pos - 1) {
                        return result;
                    }
                    length = i - pos - 1;
                    flag = pos + 1;
                }
            length++;
            i++;
        }
        return length;
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        System.out.println(q3.lengthOfLongestSubstring("ab1b"));
    }
}
