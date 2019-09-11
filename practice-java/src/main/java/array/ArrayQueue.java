package array;

/**
 * @anthor LingChen
 * @create 9/11/2019 2:42 PM
 * @Description 用数组实现一个循环队列结构
 */
public class ArrayQueue<E> {

    private Object[] arr;
    private int begin;
    private int end;
    private int currSize;

    public ArrayQueue(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("The initSize < 0");
        }
        arr = new Object[initSize];
        begin = 0;
        end = 0;
        currSize = 0;
    }

    public void add(E element) {
        if (currSize == arr.length) {
            throw new ArrayIndexOutOfBoundsException("The stack is full");
        }
        arr[end] = element;
        currSize++;
        end = end == arr.length - 1 ? 0 : end + 1;
    }

    public E poll() {
        if (currSize == 0) {
            throw new ArrayIndexOutOfBoundsException("The stack is empty");
        }
        E result = (E) arr[begin];
        currSize--;
        begin = begin == arr.length - 1 ? 0 : begin + 1;
        return result;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> stack = new ArrayQueue<>(3);
        stack.add(12);
        stack.add(13);
        stack.add(14);
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        stack.add(15);
        System.out.println(stack.poll());

    }
}
