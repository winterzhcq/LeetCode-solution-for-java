  Solution {
     public String arrangeWords(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = text.split(" ");
        if (s[0].length() > 1) s[0] = s[0].substring(0, 1).toLowerCase() + s[0].substring(1);
        else s[0].toLowerCase();
        Arrays.sort(s,(a,b)->{return a.length() - b.length();});
        for (int i = 0;i<s.length;i++){
            if (i == 0){
                if (s[0].length() > 1) s[0] = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
                else s[0] = s[0].toUpperCase();
            }
            stringBuilder.append(s[i]);
            if (i != s.length-1) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}