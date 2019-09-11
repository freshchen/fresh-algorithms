package array;

import java.util.Queue;
import java.util.Stack;

/**
 * @anthor LingChen
 * @create 9/11/2019 2:08 PM
 * @Description 用数组实现一个固定大小栈结构
 */
public class ArrayStack<E> {

    private Object[] arr;
    private int index;

    public ArrayStack(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("The initSize < 0");
        }
        arr = new Object[initSize];
        index = 0;
    }

    public void push(E element) {
        if (index == arr.length) {
            throw new ArrayIndexOutOfBoundsException("The stack is full");
        }
        arr[index++] = element;
    }

    public E pop() {
        if (index == 0) {
            throw new ArrayIndexOutOfBoundsException("The stack is empty");
        }
        E result =  (E) arr[index - 1];
        index--;
        return result;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(3);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
