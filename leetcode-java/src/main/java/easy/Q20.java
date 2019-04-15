package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @anthor LingChen
 * @create 4/15/2019 1:44 PM
 * @Description
 */
public class Q20 {
    public boolean isValid(String s) {
        boolean result = false;
        Map<String, String> stringStringMap = new HashMap<String, String>();
        stringStringMap.put(")", "(");
        stringStringMap.put("]", "[");
        stringStringMap.put("}", "{");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if (temp.equals("(") || temp.equals("[") || temp.equals("{")) {
                stack.push(temp);
            } else if (temp.equals(")") || temp.equals("]") || temp.equals("}")) {
                if (stack.empty()){
                    return result;
                } else if (!stringStringMap.get(temp).equals(stack.peek())) {
                    return result;
                } else {
                    stack.pop();
                }
            } else {
                return result;
            }


        }
        if (stack.empty()) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Q20 q20 = new Q20();
        if (q20.isValid("]")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
