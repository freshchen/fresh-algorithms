package tree.binary;


import common.MyUtils;
import common.Structure.TreeNode;

import java.util.Stack;

/**
 * @anthor LingChen
 * @create 9/14/2019 2:52 PM
 * @Description 二叉树的先序，中序，后序遍历
 */
public class Traverse {

    public static void pre(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                System.out.print(root.data + " -> ");
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
        System.out.println();
    }

    public static void preReur(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " -> ");
        preReur(root.left);
        preReur(root.right);

    }

    public static void mid(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.print(root.data + " -> ");
                root = root.right;
            }
        }
        System.out.println();
    }


    public static void midReur(TreeNode root) {
        if (root == null) {
            return;
        }
        midReur(root.left);
        System.out.print(root.data + " -> ");
        midReur(root.right);
    }

    public static void post(TreeNode root) {
        if (root != null) {
            Stack<TreeNode> stackStack = new Stack<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                stackStack.push(root);
                if (root.left != null) {
                    stack.push(root.left);
                }
                if (root.right != null) {
                    stack.push(root.right);
                }
            }
            while (!stackStack.isEmpty()) {
                System.out.print(stackStack.pop().data + " -> ");
            }
        }
        System.out.println();
    }

    public static void postReur(TreeNode root) {
        if (root == null) {
            return;
        }
        postReur(root.left);
        postReur(root.right);
        System.out.print(root.data + " -> ");
    }

    public static void main(String[] args) {
        System.out.println("pre");
        preReur(MyUtils.genBinaryTree());
        System.out.println();
        pre(MyUtils.genBinaryTree());

        System.out.println("mid");
        midReur(MyUtils.genBinaryTree());
        System.out.println();
        mid(MyUtils.genBinaryTree());

        System.out.println("post");
        postReur(MyUtils.genBinaryTree());
        System.out.println();
        post(MyUtils.genBinaryTree());

    }
}
