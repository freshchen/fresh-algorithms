package tree.binary;

import common.MyUtils;
import common.Structure;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 22:15
 * @Author: Ling Chen
 * @Description:
 */
public class JudgeTreeTest {

    @Test
    public void isAVL() {
        Structure.TreeNode root = MyUtils.genBinaryTree();
        assertTrue(JudgeTree.isAVL(root));
    }
}