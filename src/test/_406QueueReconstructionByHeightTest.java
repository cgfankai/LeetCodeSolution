package test;

import main.java._406QueueReconstructionByHeight;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fankai on 2016/11/24.
 */
public class _406QueueReconstructionByHeightTest {

    @Test
    public void result(){
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] result = new _406QueueReconstructionByHeight().reconstructQueue(people);

        int[][] people1 = {{5,0}, {7,0}, {5,2}, {6,1}, {4,4}, {7,1}};

        Assert.assertArrayEquals(people1, result);
    }
}
