package common;

/**
 * @anthor LingChen
 * @create 9/12/2019 4:00 PM
 * @Description
 */
public class Structure {

    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    public static class TreeNode<E> {
        public E data;
        public TreeNode<E> left;
        public TreeNode<E> right;

        public TreeNode(E data) {
            this.data = data;
        }
    }

}

