/**
 * Created by fankai on 2016/11/21.
 */
public class _463IsandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0 ; i < grid.length ; i ++) {
            for (int j = 0 ; j < grid[i].length ; j ++ ) {
                if(grid[i][j] == 1) {
                    if(i == 0 || i == grid.length - 1)
                        perimeter++;
                    if (j == 0 || j == grid[i].length - 1)
                        perimeter++;
                    if(i == grid.length - 1)
                        perimeter++;
                    if (j == grid[i].length - 1)
                        perimeter++;
                    if (j > 0  && grid[i][j - 1] == 0 )
                        perimeter++;
                    if (i > 0  && grid[i - 1][j] == 0 )
                        perimeter++;
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 0)
                        perimeter ++;
                    if (i < grid.length - 1 && grid[i+1][j] == 0)
                        perimeter++;
                }
            }
        }
        return perimeter;
    }
}
