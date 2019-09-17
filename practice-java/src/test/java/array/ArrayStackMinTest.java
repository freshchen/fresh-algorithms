package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @anthor LingChen
 * @create 9/17/2019 10:11 AM
 * @Description
 */
public class ArrayStackMinTest {

    ArrayStackMin stack;

    @Before
    public void setUp() throws Exception {
        stack = new ArrayStackMin();
    }

    @Test
    public void getMin() {
        stack.push(145);
        stack.push(16);
        stack.push(145);
        stack.push(18);
        Assert.assertEquals((int) stack.getMin(), 16);
        Assert.assertEquals((int) stack.pop(), 18);
        Assert.assertEquals((int) stack.getMin(), 16);
        Assert.assertEquals((int) stack.pop(), 145);
        Assert.assertEquals((int) stack.getMin(), 16);
        Assert.assertEquals((int) stack.pop(), 16);
        Assert.assertEquals((int) stack.getMin(), 145);
    }
}