package tree.binary;


import common.MyUtils;
import common.structure.TreeNode;

import java.util.LinkedList;
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
            // 先进右再进左
            while (!stack.isEmpty()) {
                root = stack.pop();
                System.out.print(root.val + " -> ");
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
        System.out.print(root.val + " -> ");
        preReur(root.left);
        preReur(root.right);

    }

    public static void mid(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        // 左走到头了开始弹，然后去右
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.print(root.val + " -> ");
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
        System.out.print(root.val + " -> ");
        midReur(root.right);
    }

    public static void post(TreeNode root) {
        // 把线序遍历反过来，得到前右左，然后再反过来变成左右前
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
                System.out.print(stackStack.pop().val + " -> ");
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
        System.out.print(root.val + " -> ");
    }

    public static void level(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode curr = null;
        while (!queue.isEmpty()) {
            curr = queue.pop();
            System.out.print(curr.val + " -> ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
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

        System.out.println("level");
        level(MyUtils.genBinaryTree());
        System.out.println();

    }
}
