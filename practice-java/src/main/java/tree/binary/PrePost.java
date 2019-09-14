package tree.binary;

import common.MyUtils;
import common.Structure.TreeNode;

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
        } else if (node == node.parent.right) {
            result = node.parent;
        } else {
            TreeNode root = toTheEnd(node, "parent");
            while (node.parent.left != null) {
                if (node == root){
                    result = root;
                    break;
                }
                node = node.parent;
            }
            result = node;
        }
        return result;
    }

    public static TreeNode getPost(TreeNode node) {
        TreeNode result = null;
        if (node.right != null) {
            result = toTheEnd(node.right, "left");
        }
        return result;
    }

    public static TreeNode toTheEnd(TreeNode node, String dir) {
        TreeNode result = null;
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
        TreeNode node = MyUtils.genBinaryTree().right.left;
        System.out.println(node.data + "'s pre is " + getPre(node).data);

        System.out.println("post");
        System.out.println(node.data + "'s post is " + getPost(node).data);

    }
}
