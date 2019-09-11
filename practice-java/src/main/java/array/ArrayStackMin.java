package array;

import java.util.Stack;

/**
 * @anthor LingChen
 * @create 9/11/2019 3:18 PM
 * @Description 提供返回栈中最小值功能要求时间复杂度O(1),辅助队列跟随记录主队列最小值情况
 */
public class ArrayStackMin {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public ArrayStackMin() {
        stackMin = new Stack<>();
        stackData = new Stack<>();
    }

    public void push(Integer element) {
        if (stackMin.isEmpty()) {
            stackMin.push(element);
        } else if (element < getMin()) {
            stackMin.push(element);
        } else {
            stackMin.push(getMin());
        }
        stackData.push(element);
    }

    public Integer pop() {
        stackMin.pop();
        return stackData.pop();
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("The min stack is empty");
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        ArrayStackMin stack = new ArrayStackMin();
        stack.push(145);
        stack.push(16);
        stack.push(145);
        stack.push(18);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
    }

}
