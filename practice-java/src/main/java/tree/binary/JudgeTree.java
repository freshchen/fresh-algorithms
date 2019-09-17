package tree.binary;

import common.MyUtils;
import common.structure.TreeNode;

/**
 * @anthor LingChen
 * @create 9/15/2019 1:53 PM
 * @Description
 */
public class JudgeTree {

    public static boolean isAVL(TreeNode root) {
        if (root == null) {
            new NullPointerException("The root of Tree is null!");
        }
        return (boolean) isAVLProcess(root)[0];
    }

    public static Object[] isAVLProcess(TreeNode root) {
        if (root == null) {
            return new Object[]{true, 0};
        }
        Object[] left = isAVLProcess(root.left);
        if ((boolean) left[0] == false) {
            return new Object[]{false, 0};
        }
        Object[] right = isAVLProcess(root.right);
        if ((boolean) right[0] == false) {
            return new Object[]{false, 0};
        }
        if (Math.abs((int) left[1] - (int) right[1]) > 1) {
            return new Object[]{false, 0};
        }
        return new Object[]{true, Math.max((int) left[1], (int) right[1]) + 1};
    }

    public static void main(String[] args) {
        TreeNode root = MyUtils.genBinaryTree();
        System.out.println(isAVL(root));
    }
}
