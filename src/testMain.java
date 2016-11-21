import java.util.Arrays;

/**
 * Created by fankai on 2016/10/12.
 */
public class testMain {
    public static void main(String[] args){
        int[] test1 = {0,1,0,0};
        int[] test2 = {1,1,1,0};
        int[] test3 = {0,1,0,0};
        int[] test4 = {1,1,0,0};
        int arr[][] = new int[4][4];
        arr[0] = test1;
        arr[1] = test2;
        arr[2] = test3;
        arr[3] = test4;

        System.out.println(_463IsandPerimeter.islandPerimeter(arr));
    }
}
