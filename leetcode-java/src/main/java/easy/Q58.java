package easy;

/**
 * @anthor LingChen
 * @create 4/16/2019 3:13 PM
 * @Description
 */
public class Q58 {
    public int lengthOfLastWord(String s) {
        int result = 0;
        String[] strings = s.split(" ");
        if (strings == null || strings.length == 0){
            return result;
        }
        result = strings[strings.length - 1].length();
        return result;
    }

    public static void main(String[] args) {
        Q58 q58 = new Q58();
        System.out.println(q58.lengthOfLastWord("    "));
    }
}
