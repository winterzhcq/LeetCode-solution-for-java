class Solution {
   Map<String, String> map = new HashMap<>();

    {
        map.put("&quot", "\"");
        map.put("&apos", "\'");
        map.put("&amp", "&");
        map.put("&gt", ">");
        map.put("&lt", "<");
        map.put("&frasl", "/");
    }

    public String entityParser(String text) {
        StringBuilder str = new StringBuilder();
        String[] stringArr = text.split(";");
        for (int i = 0; i < stringArr.length; i++) {
            int begin=0 ,end = 0;
            if (stringArr[i].isEmpty() || (begin = stringArr[i].indexOf("&")) == -1){
                str.append(stringArr[i]);
                continue;
            }
            String temp = stringArr[i].substring(begin,stringArr[i].length());
            String s = map.get(temp);
            str.append(stringArr[i].substring(0,begin));
            if (s != null) {
                str.append(s);
            } else {
                str.append(temp+";");
            }
        }
        return str.toString();
    }
}