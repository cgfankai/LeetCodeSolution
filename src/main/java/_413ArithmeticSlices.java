package main.java;

/**
 * Created by cgfan on 2016/11/27.
 */
public class _413ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3)
            return 0;
        int sumOfArithmeticSlice = 0;
        int numberOfElement = 0;
        for (int i = 2 ; i < A.length; i++){
            if (A[i] - A[i - 1] == A[i-1] - A[i-2]){
                numberOfElement++;
                sumOfArithmeticSlice += numberOfElement;
            }else numberOfElement = 0;
        }
        return sumOfArithmeticSlice;
    }
}
