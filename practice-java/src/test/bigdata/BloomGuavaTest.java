package bigdata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/16 21:31
 * @Author: Ling Chen
 * @Description:
 */
public class BloomGuavaTest {

    @Test
    public void init() {
        int capacity = 100000;
        boolean result1 = BloomGuava.init(capacity, 0.001).mightContain(capacity - 1);
        assertTrue(result1);
        boolean result2 = BloomGuava.init(capacity, 0.001).mightContain(capacity);
        assertFalse(result2);

    }
}