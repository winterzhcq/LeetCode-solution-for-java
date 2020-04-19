class Solution {
     public String reformat(String s) {
        String s1 = "";
        String s2 = "";
        int i = 0;
        int j = 0;
        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122) {
                i++;
                s1 += c;
            }
            if (c >= 48 && c <= 57) {
                j++;
                s2 += c;
            }
        }
        if (Math.abs(i - j) > 1) return "";

        String res = "";
        int lengh = i;
        if (i > j) lengh = j;
        for (int h = 0; h < lengh; h++) {
            if (i > j){
                res += s1.charAt(h);
                res += s2.charAt(h);
            }else {
                res += s2.charAt(h);
                res += s1.charAt(h);
            }

        }
        if (i > j) res += s1.charAt(s1.length()-1);
        if (j > i) res += s2.charAt(s2.length()-1);

        return res;
    }
}