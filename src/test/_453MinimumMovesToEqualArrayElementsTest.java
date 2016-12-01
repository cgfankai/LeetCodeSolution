package test;

import main.java._453MinimumMovesToEqualArrayElements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fankai on 2016/12/1.
 */
public class _453MinimumMovesToEqualArrayElementsTest {
    @Test
    public void minMoves() throws Exception {
        int[] array = {1,2,3};
        int minMove = new _453MinimumMovesToEqualArrayElements().minMoves(array);
        assertEquals(3,minMove);

        array = new int[]{1, 2};
        minMove = new _453MinimumMovesToEqualArrayElements().minMoves(array);
        assertEquals(1,minMove);
    }

}