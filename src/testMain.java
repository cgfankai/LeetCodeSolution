import main._406QueueReconstructionByHeight;
import main._463IsandPerimeter;

/**
 * Created by fankai on 2016/10/12.
 */
public class testMain {
    public static void main(String[] args){
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] arr = new _406QueueReconstructionByHeight().reconstructQueue(people);

        System.out.println(_463IsandPerimeter.islandPerimeter(arr));
    }
}
