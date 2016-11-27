package test;

import main.java.Collections._462MinimumMovesToEqualArrayElementsII;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cgfan on 2016/11/27.
 */
public class _462MinimumMovesToEqualArrayElementsIITest {
    @Test
    public void minMoves2() throws Exception {
        int[] example = {1,2,3};
        int result = new _462MinimumMovesToEqualArrayElementsII().minMoves2(example);
        Assert.assertEquals(2, result);
    }

}