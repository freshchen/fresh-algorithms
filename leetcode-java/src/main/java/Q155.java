import java.util.Stack;

/**
 * @anthor LingChen
 * @create 7/23/2019 3:17 PM
 * @Description
 */
public class Q155 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Q155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.peek() >= x || stack.isEmpty()){
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            minStack.pop();
            stack.pop();
        }

    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        throw new RuntimeException("");
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        throw new RuntimeException("");
    }
}
