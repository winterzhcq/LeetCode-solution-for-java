class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int right = Integer.valueOf(stack.pop());
                int left = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(left + right));
            }else if(s.equals("-")){
                 int right = Integer.valueOf(stack.pop());
                int left = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(left - right));
            }else if(s.equals("*")){
                 int right = Integer.valueOf(stack.pop());
                int left = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(left * right));
            }else if(s.equals("/")){
                 int right = Integer.valueOf(stack.pop());
                int left = Integer.valueOf(stack.pop());
                stack.push(String.valueOf(left / right));
            }else{
                stack.push(s);
            }
        }
        return Integer.valueOf(stack.pop());
    }
}