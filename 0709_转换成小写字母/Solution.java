class Solution {
    public String toLowerCase(String str) {
        char[] ch = new char[str.length()];
        for(int i = 0 ; i < str.length();i++){
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char)(c+32);
            }
            ch[i] = c;
        }
        return  new String(ch);
    }
}