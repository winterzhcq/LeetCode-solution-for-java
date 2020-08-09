class Solution {
 Stack<Character> queue = new Stack<>();
    public String makeGood(String s) {
        if (s == "" || s == null || s.length() == 1)return s;
        queue.add(s.charAt(0));
        for (int i = 1;i<s.length();i++){
            if (queue.isEmpty()) queue.add(s.charAt(i));
            else if (Math.abs(s.charAt(i) - queue.peek()) == 32) queue.pop();
            else queue.add(s.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder("");
        String res = "";
        while (!queue.isEmpty())res = queue.pop()+res;
        return res;
    }
}