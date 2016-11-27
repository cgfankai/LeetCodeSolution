package main.java;

import java.util.Arrays;

/**
 * Created by fankai on 2016/11/27.
 */
public class _462MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        if (nums == null || nums.length < 1)
            return 0;
        Arrays.sort(nums);
        int medium = 0;
        if (nums.length % 2 != 0){
            medium = nums[nums.length / 2];
        }else medium = ( nums[nums.length / 2] + nums[nums.length / 2 - 1] ) / 2;
        int result = 0 ;
        for(int i : nums){
            result += Math.abs( i - medium);
        }
        return result;
    }
}
