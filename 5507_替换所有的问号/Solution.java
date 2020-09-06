class Solution {
    public String modifyString(String s) {
        StringBuffer buffer = new StringBuffer(s);
        for (int i = 0;i<s.length();i++){
            char before = 0;
            char after = 0;
            if (i>0) before = buffer.charAt(i-1);
            if (i<s.length()-1) after = buffer.charAt(i+1);
            char c = (char) (Math.random() * 26 + 'a');
            if (buffer.charAt(i) == '?'){
                while (before == c || after == c) c = (char) (Math.random() * 26 + 'a');
                buffer.replace(i,i+1,c+"");
            }
        }
        return buffer.toString();
    }
}