package main.java;

/**
 * Created by fankai on 2016/11/29.
 */
public class _167TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        //int j = 0;
        for (int i = 0, j = numbers.length - 1; i < j;){
                if (numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }else {
                    if (numbers[i] + numbers[j] > target){
                        j--;
                    }else i++;
                }
        }
        return result;
    }
}
