package common.structure;

/**
 * 二叉树
 *
 * @param <E>
 */
public class TreeNode<E> {
    public E data;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public TreeNode<E> parent;

    public TreeNode(E data) {
        this.data = data;
    }
}
