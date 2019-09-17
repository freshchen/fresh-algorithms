package tree.tire;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @anthor LingChen
 * @create 9/17/2019 3:29 PM
 * @Description
 */
public class TireTest {

    private Tire tire;

    @Before
    public void setUp() throws Exception {
        tire = new Tire();
    }

    @Test
    public void searchCount() {
        tire.insert("hello");
        tire.insert("world");
        tire.insert("hello");
        Assert.assertEquals(tire.searchCount("hello", true), 2);
    }

    @Test
    public void searchPrefix() {
        tire.insert("hello");
        tire.insert("heworld");
        tire.insert("hello");
        Assert.assertEquals(tire.searchCount("hello", false), 2);
        Assert.assertEquals(tire.searchCount("hell", false), 2);
        Assert.assertEquals(tire.searchCount("he", false), 3);
    }

    @Test
    public void delete() {
        tire.insert("hello");
        tire.insert("world");
        tire.insert("hello");
        tire.delete("hello");
        Assert.assertNotEquals(tire.searchCount("hello", true), 2);
        Assert.assertEquals(tire.searchCount("hello", true), 1);
    }
}