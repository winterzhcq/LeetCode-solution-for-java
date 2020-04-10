class Solution {
        public String reverseVowels(String s) {
        char[] letters = s.toCharArray();
        //使用快排的方法
        List<Character> list = new ArrayList<>();
        char[] letter=new char[] {'a','e','i','o','u','A','E','I','O','U'};
        int len = s.length();
        for(int i=0;i<len;i++)
            list.add(letter[i]);
        if (len > 1) {
            int i = 0;
            int j = len - 1;
            char temp;

            while (i < j) {
                while (j > i && !list.contains(letters[i]))
                    ++i;
                while (j > i && !list.contains(letters[j]))
                    --j;
                if (i < j) {
                    temp = letters[j];
                    letters[j] = letters[i];
                    letters[i] = temp;
                    i++;
                    j--;
                }
            }
            s = String.valueOf(letters);
        }
        return s;
    }
}