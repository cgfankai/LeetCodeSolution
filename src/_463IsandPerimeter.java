/**
 * Created by fankai on 2016/11/21.
 */
public class _463IsandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 2;
        for (int i = 0 ; i + 1 < grid.length ; i ++) {
            for (int j = 0 ; j + 1 < grid[i].length ; j ++ ) {
                if (grid[i + 1][j] != 0)
                    perimeter++;
                if (grid[i][j + 1] != 0)
                    perimeter++;
            }
        }
        return perimeter;
    }
}
