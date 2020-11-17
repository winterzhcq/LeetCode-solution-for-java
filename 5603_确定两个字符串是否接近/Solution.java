

import java.util.Arrays;

public class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        int[] sequence1 = new int[26];
        int[] sequence2 = new int[26];
        for (int i=0;i<word1.length();i++)
            sequence1[word1.charAt(i)-'a']++;
        for (int i=0;i<word2.length();i++)
            sequence2[word2.charAt(i)-'a']++;
        for (int i = 0;i<sequence1.length;i++){
            if ((sequence1[i]>0 && sequence2[i] == 0)
                    || (sequence1[i] == 0 && sequence2[i] >0))
                return false;
        }
        Arrays.sort(sequence1);
        Arrays.sort(sequence2);
        for (int i = 0; i < sequence1.length ; i++) {
            if (sequence1[i] != sequence2[i]) return false;
        }
        return true;
    }
}
