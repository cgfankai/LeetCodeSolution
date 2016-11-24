package main;

import java.util.*;

/**
 * Created by fankai on 2016/10/26.
 */
public class _406QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (x, y) -> {
            if (x[0]!=y[0])
                return -x[0] + y[0];
            else return x[1] - y[1];
        } );

        List<int[]> result  = new LinkedList<>();
        for (int[] ints : people){
            result.add(ints[1], ints);
        }
        return result.toArray(new int[people.length][]);
    }
}
