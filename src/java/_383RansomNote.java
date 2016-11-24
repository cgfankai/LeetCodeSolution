package java;

import java.util.Map;

/**
 * Created by fankai on 2016/10/19.
 */
public class _383RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charNum = new int[26];
        for (int i = 0 ; i < magazine.length() ; i++){
            charNum[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0 ; i < ransomNote.length() ; i++){
            charNum[ransomNote.charAt(i) - 'a']--;
            if (charNum[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;

    }
}
