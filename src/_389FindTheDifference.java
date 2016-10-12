/**
 * Created by fankai on 2016/10/12.
 */
public class _389FindTheDifference {
    public static char findTheDifference(String s, String t) {
        int[] temp = new int[26];
        for (int i = 0; i < s.length();i++){
            if(temp[s.charAt(i) - 'a'] == 0){
                temp[s.charAt(i) - 'a'] = 1;
            }
        }

        for (int i = 0; i < t.length();i++) {
            if (temp[t.charAt(i) - 'a'] == 0) {
                return t.charAt(i);
            }
        }
        return 'a';
    }
}
