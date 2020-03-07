class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        if (len < 2)  return s;
        // 记录是否在已经得到的字符串中
        boolean[] set = new boolean[26];
        // 记录每个字符出现的最后一个位置
        int[] lastAppearIndex = new int[26];
        for (int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }
        stack.push('a');
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            // 如果存在就直接跳过
            if (set[currentChar - 'a']) continue;

            // 如果当前的比栈顶元素小，而且栈顶元素在后面还存在，可以删除栈顶元素
            while (stack.peek() > currentChar && lastAppearIndex[stack.peek() - 'a'] >= i) {
                char top = stack.pop();
                set[top - 'a'] = false;
            }

            stack.push(currentChar);
            set[currentChar - 'a'] = true;
        }

        int size = stack.size();
        StringBuilder stringBuilder = new StringBuilder();
        // 注意：这里只弹栈 size - 1 次
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.insert(0, stack.pop());
        }
        return stringBuilder.toString();
    }
}