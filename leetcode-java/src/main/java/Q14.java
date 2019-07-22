/**
 * @anthor LingChen
 * @create 4/15/2019 10:07 AM
 * @Description
 */
public class Q14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs.length > 1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() <= i || strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Q14 q14 = new Q14();
        System.out.println(q14.longestCommonPrefix(new String[]{"as", "asda", "asas"}));
    }
}
