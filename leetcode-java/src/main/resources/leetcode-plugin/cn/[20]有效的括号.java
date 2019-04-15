//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
//

class Solution {
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
}