package main.java;

import java.util.Arrays;

/**
 * Created by fankai on 2016/12/1.
 */
public class _453MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int result = 0;
        if (nums.length == 2){
            return nums[1] - nums[0];
        }
        while (isNotEqual(nums)){
            for (int i = 0; i < nums.length - 1; i++){
                nums[i]++;
            }
            result++;
        }
        return result;
    }
    public static boolean isNotEqual(int[] nums){
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1])
            return false;
        else return true;
    }
}
