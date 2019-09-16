package tree.union;

import common.Structure.Union;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 22:23
 * @Author: Ling Chen
 * @Description:
 */
public class UnionFindMapTest {

    @Test
    public void isSameUnion() {
        Union <String> union1 = new Union <>("dong");
        Union <String> union2 = new Union <>("xi");
        Union <String> union3 = new Union <>("nan");
        UnionFindMap.init(Arrays.asList(union1, union2, union3));

        Assert.assertFalse(UnionFindMap.isSameUnion(union1, union2));

        UnionFindMap.union(union1, union2);
        Assert.assertTrue(UnionFindMap.isSameUnion(union1, union2));

        UnionFindMap.union(union1, union3);
        Assert.assertTrue(UnionFindMap.isSameUnion(union1, union3));

        Assert.assertTrue(UnionFindMap.isSameUnion(union2, union3));
    }
}