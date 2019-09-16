package common;

/**
 * @anthor LingChen
 * @create 9/12/2019 4:00 PM
 * @Description
 */
public class Structure {

    /**
     * 链表
     *
     * @param <E>
     */
    public static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    /**
     * 二叉树
     *
     * @param <E>
     */
    public static class TreeNode<E> {
        public E data;
        public TreeNode<E> left;
        public TreeNode<E> right;
        public TreeNode<E> parent;

        public TreeNode(E data) {
            this.data = data;
        }
    }

    /**
     * 并查集
     *
     * @param <E>
     */
    public static class Union<E> {
        public E data;

        public Union(E data) {
            this.data = data;
        }
    }

}

