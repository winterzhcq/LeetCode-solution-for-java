class Solution {
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        // ����
        if (len < 2)  return s;

        // ��¼�Ƿ����Ѿ��õ����ַ�����
        boolean[] set = new boolean[26];

        // ��¼ÿ���ַ����ֵ����һ��λ��
        int[] lastAppearIndex = new int[26];
        for (int i = 0; i < len; i++) {
            lastAppearIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            // ������ھ�ֱ������
            if (set[currentChar - 'a']) continue;

            // �����ǰ�ı�ջ��Ԫ��С������ջ��Ԫ���ں��滹���ڣ�����ɾ��ջ��Ԫ��
            while (!stack.empty() && stack.peek() > currentChar && lastAppearIndex[stack.peek() - 'a'] >= i) {
                char top = stack.pop();
                set[top - 'a'] = false;
            }

            stack.push(currentChar);
            set[currentChar - 'a'] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.insert(0, stack.pop());
        }
        return stringBuilder.toString();

    }
}