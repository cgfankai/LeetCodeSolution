package java;

/**
 * Created by fankai on 2016/10/12.
 */
public class _389FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char result = 'a';
        int[] charNumsS = new int[26];
        for (int i = 0; i < s.length(); i++){
            charNumsS[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            charNumsS[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++){
            if(charNumsS[i] == -1)
                result = (char) ('a' + i);
        }
        return 'a';
    }
}
