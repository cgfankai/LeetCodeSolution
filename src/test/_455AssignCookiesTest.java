package test;

import main.java._455AssignCookies;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fankai on 2016/11/27.
 */
public class _455AssignCookiesTest {
    @Test
    public void findContentChildren() throws Exception {
        int result = new _455AssignCookies().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1});
        Assert.assertEquals(1, result);
        result = new _455AssignCookies().findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3});
        Assert.assertEquals(2, result);
    }

}