import java.util.Stack;

class Solution {
    //使用栈解决
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0;i<chars.length;i++){
            Character c =   s.charAt(i);
            if (c == '{' || c=='('|| c=='[')
                stack.push(c);
            else {
                if (stack.empty())
                    return false;
                Character pop = stack.pop();
                if (pop == '{' && c!='}')
                    return false;
                if (pop == '('&& c!=')')
                    return false;
                if (pop == '[' && c!=']')
                    return false;
            }

        }
        return stack.isEmpty();
    }
}