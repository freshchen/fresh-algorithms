/**
 * @program: fresh-algorithms
 * @Date: 2019/7/22 21:02
 * @Author: Ling Chen
 * @Description:
 */
public class Q617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.right);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
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
