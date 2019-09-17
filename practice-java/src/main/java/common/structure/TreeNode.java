package common.structure;

/**
 * 二叉树
 *
 * @param <E>
 */
public class TreeNode<E> {
    public E val;
    public TreeNode<E> left;
    public TreeNode<E> right;
    public TreeNode<E> parent;

    public TreeNode(E val) {
        this.val = val;
    }
}
