package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/17 21:33
 * @Author: Ling Chen
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc20BracketIsValid {
    public boolean isValid(String s) {
        boolean result = false;
        Map <String, String> stringStringMap = new HashMap <String, String>();
        stringStringMap.put(")", "(");
        stringStringMap.put("]", "[");
        stringStringMap.put("}", "{");
        Stack <String> stack = new Stack <String>();
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if (temp.equals("(") || temp.equals("[") || temp.equals("{")) {
                stack.push(temp);
            } else if (temp.equals(")") || temp.equals("]") || temp.equals("}")) {
                if (stack.empty()) {
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
}
