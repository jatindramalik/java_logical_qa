import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    // *1.Isometric String */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Boolean> used = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (used.containsKey(c2) && used.get(c2)) {
                    return false;
                }
                map.put(c1, c2);
                used.put(c2, true);
            }
        }

        return true;
    }

    // *2 AnagramStrings*/
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
    //*3.Reverse String */
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
    }

}
