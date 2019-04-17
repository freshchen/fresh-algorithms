package easy;

/**
 * @anthor LingChen
 * @create 4/15/2019 5:13 PM
 * @Description
 */
public class Q38 {
    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        }
        String count = countAndSay(n-1);
        char target = count.charAt(0);
        int countNum = 1;
        StringBuffer result = new StringBuffer();
        for(int i=1; i<count.length(); i++) {
            char temp = count.charAt(i);
            if (target == temp) {
                countNum++;
            } else {
                result.append(countNum).append(target);
                target = temp;
                countNum = 1;
            }
        }
        result.append(countNum).append(target);
        return result.toString();
    }

    public static void main(String[] args) {
        Q38 q38 = new Q38();
        System.out.println(q38.countAndSay(12));
    }
}
