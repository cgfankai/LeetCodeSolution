package test;

import main.java._167TwoSumII_InputArrayIsSorted;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fankai on 2016/11/29.
 */
public class _167TwoSumII_InputArrayIsSortedTest {
    @Test
    public void twoSum() throws Exception {
        int[] result = new _167TwoSumII_InputArrayIsSorted().twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(new int[]{1,2}, result);
        result = new _167TwoSumII_InputArrayIsSorted().twoSum(new int[]{-3,3,4,90}, 0);
        assertArrayEquals(new int[]{1,2}, result);
    }

}