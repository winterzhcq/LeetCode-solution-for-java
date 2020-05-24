public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count = -1;
        if (sentence == null || sentence.length() == 0
                || searchWord == null || searchWord.length() == 0) return -1;
        String[] words = sentence.split(" ");
        for (int i = 0;i<words.length;i++){
            int j = 0;int k=0;
            if (words[i].length() < searchWord.length())continue;
            while (j < words[i].length()){
                if (words[i].charAt(j) != searchWord.charAt(k)) break;
                j++;k++;
                if (k == searchWord.length()) return i+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPrefixOfWord("love errichto jonathan dumb","dumb"));
    }
}
