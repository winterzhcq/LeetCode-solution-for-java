class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        for (String s : path.split("/")) {
            if("..".equals(s)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!s.isEmpty()&&!".".equals(s))
                stack.push(s);
        }
        String res = "";
        for (String d : stack) res = "/" + d + res;
        return res.isEmpty() ? "/" : res; 
    }
}