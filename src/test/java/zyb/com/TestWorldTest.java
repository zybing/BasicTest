package zyb.com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ybzhang on 2016/8/27.
 */
public class TestWorldTest {
    TestWorld testWorld;
    @Before
    public void setUp() throws Exception {
        testWorld=new TestWorld();
    }

    @Test
    public void test1() throws Exception {
        assertEquals("123",testWorld.test());
    }

}