package main.java;

/**
 * Created by fankai on 2016/11/29.
 */
public class _167TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < numbers.length;i++ ){
            for (j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }
}
