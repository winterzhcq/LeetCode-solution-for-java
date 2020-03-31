class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" "); //�Կո�ָ�str
        if(s.length != pattern.length()) return false; //���û��ȫ���ɶԵ�ӳ���򷵻�false
        Map<Character, String> map = new HashMap<>(); //���ӳ��
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){ //1. û��ӳ��ʱִ��
                if(map.containsValue(s[i])) return false; //2. û��ӳ��������s[i]�ѱ�ʹ�ã���ƥ�䷵��false
                map.put(pattern.charAt(i), s[i]); //3. ����ӳ��
            }else{
                if(!map.get(pattern.charAt(i)).equals(s[i])) return false; //��ǰ�ַ�����ӳ�䲻ƥ��,����false
            }
        }
        return true;
    }
}