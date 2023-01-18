package day6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length() - s1.length(); i++) {
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
            s2count[s2.charAt(i) - 'a']--;
            s2count[s2.charAt(i + s1.length()) - 'a']++;
        }
        return Arrays.equals(s1count, s2count);
    }

}
