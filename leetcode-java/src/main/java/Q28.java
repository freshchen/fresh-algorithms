/**
 * @anthor LingChen
 * @create 4/15/2019 4:13 PM
 * @Description
 */
public class Q28 {
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int i = 0, j = needle.length();
        while (j <= haystack.length()) {
            if (needle.equals(haystack.substring(i++, j++))) {
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q28 q28 = new Q28();
        System.out.println(q28.strStr("mississippi", "issip"));
    }
}
