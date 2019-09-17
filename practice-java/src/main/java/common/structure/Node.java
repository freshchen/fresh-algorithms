package common.structure;

/**
 * 链表
 *
 * @param <E>
 */
public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data) {
        this.data = data;
    }
}
