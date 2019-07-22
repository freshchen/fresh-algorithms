import java.util.HashMap;
import java.util.Map;

/**
 * @program: fresh-algorithms
 * @Date: 2019/4/14 20:30
 * @Author: Ling Chen
 * @Description:
 */
public class Q13 {
    public int romanToInt(String s) {
        int result = 0;
        Map <String, Integer> romanMap = new HashMap <String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        int length = s.length();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = (romanMap.get(String.valueOf(s.charAt(i))));
        }
        for (int i = 0; i < list.length - 1; i++) {
            if ((list[i] == 1 && list[i + 1] == 5)) {
                list[i + 1] = 4;
                list[i] = 0;
            }
            if ((list[i] == 1 && list[i + 1] == 10)) {
                list[i + 1] = 9;
                list[i] = 0;
            }
            if ((list[i] == 10 && list[i + 1] == 50)) {
                list[i + 1] = 40;
                list[i] = 0;
            }
            if ((list[i] == 10 && list[i + 1] == 100)) {
                list[i + 1] = 90;
                list[i] = 0;
            }
            if ((list[i] == 100 && list[i + 1] == 500)) {
                list[i + 1] = 400;
                list[i] = 0;
            }
            if ((list[i] == 100 && list[i + 1] == 1000)) {
                list[i + 1] = 900;
                list[i] = 0;
            }
            if ((list[i] == 1 && list[i + 1] == 5)) {
                list[i + 1] = list[i + 1] - list[i];
                list[i] = 0;
            }
        }
        for (int i = 0; i < list.length; i++) {
            result += list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Q13 q13 = new Q13();
        int result = q13.romanToInt("MCMXCIV");
        System.out.println(String.valueOf(result));
    }
}
