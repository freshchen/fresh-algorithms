/**
 * @program: fresh-algorithms
 * @Date: 2019/7/22 21:33
 * @Author: Ling Chen
 * @Description:
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left_length = maxDepth(root.left);
        int right_length = maxDepth(root.right);
        return Math.max(left_length,right_length) + 1;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
