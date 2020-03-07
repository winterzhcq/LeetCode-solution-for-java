class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        if (len < 2)  return s;
        // ��¼�Ƿ����Ѿ��õ����ַ�����
        boolean[] set = new boolean[26];
        // ��¼ÿ���ַ����ֵ����һ��λ��
        int[] lastAppearIndex = new int[26];
        for (int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }
        stack.push('a');
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            // ������ھ�ֱ������
            if (set[currentChar - 'a']) continue;

            // �����ǰ�ı�ջ��Ԫ��С������ջ��Ԫ���ں��滹���ڣ�����ɾ��ջ��Ԫ��
            while (stack.peek() > currentChar && lastAppearIndex[stack.peek() - 'a'] >= i) {
                char top = stack.pop();
                set[top - 'a'] = false;
            }

            stack.push(currentChar);
            set[currentChar - 'a'] = true;
        }

        int size = stack.size();
        StringBuilder stringBuilder = new StringBuilder();
        // ע�⣺����ֻ��ջ size - 1 ��
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.insert(0, stack.pop());
        }
        return stringBuilder.toString();
    }
}