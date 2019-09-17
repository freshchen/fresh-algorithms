package tree.binary;

import common.MyUtils;
import common.structure.TreeNode;

/**
 * @anthor LingChen
 * @create 9/14/2019 4:41 PM
 * @Description 寻找二叉树，中序遍历中的某节点的前驱节点和后继节点
 */
public class PrePost {


    public static TreeNode getPre(TreeNode node) {
        TreeNode result = null;
        if (node.left != null) {
            result = toTheEnd(node.left, "right");
        } else {
            while (node != node.parent.right && node.parent != null) {
                node = node.parent;
            }
            result = node == node.parent.right ? node.parent : result;
        }
        return result;
    }

    public static TreeNode getPost(TreeNode node) {
        TreeNode result = null;
        if (node.right != null) {
            result = toTheEnd(node.right, "left");
        } else {
            while (node != node.parent.left && node.parent != null) {
                node = node.parent;
            }
            result = node == node.parent.left ? node.parent : result;
        }
        return result;
    }

    public static TreeNode toTheEnd(TreeNode node, String dir) {
        TreeNode result = new TreeNode(-1);
        if ("left".equals(dir)) {
            while (node.left != null) {
                node = node.left;
            }
        } else if ("right".equals(dir)) {
            while (node.right != null) {
                node = node.right;
            }
        } else if ("parent".equals(dir)) {
            while (node.parent != null) {
                node = node.parent;
            }
        }
        result = node;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("pre");
        TreeNode node = MyUtils.genBinaryTree().left.left;
        System.out.println(node.val + "'s pre is " + getPre(node).val);

        System.out.println("post");
        System.out.println(node.val + "'s post is " + getPost(node).val);

    }
}
