package test;

import main.java._413ArithmeticSlices;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fankai on 2016/11/27.
 */
public class _413ArithmeticSlicesTest {
    @Test
    public void test(){
        int[] A = {1,2,3,4};
        int result = new _413ArithmeticSlices().numberOfArithmeticSlices(A);
        Assert.assertEquals(3, result);
    }
}