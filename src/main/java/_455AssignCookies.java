package main.java;

import java.util.Arrays;

/**
 * Created by fankai on 2016/11/27.
 */
public class _455AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        for (int i = 0, j = 0 ; i < g.length && j < s.length ; ){
            if (s[j] >= g[i]) {
                result ++;
                i ++;
                j ++;
            }
            else j++;
        }
        return result;
    }
}
