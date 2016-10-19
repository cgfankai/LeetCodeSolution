package Collections;

import java.util.HashSet;

/**
 * Created by fankai on 2016/10/19.
 */
public class _349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSetResult = new HashSet<>();
        for (int i : nums1){
            hashSet.add(i);
        }
        for (int i : nums2){
            if (hashSet.contains(i))
                hashSetResult.add(i);
        }
        int[] result = new int[hashSetResult.size()];
        int j = 0;
        for (Integer i : hashSetResult){
            result[j++] = i;
        }
        return result;
    }
}
