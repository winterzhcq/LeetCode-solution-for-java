

import java.util.HashMap;
import java.util.Map;

/**
 * @author winter
 * @date 2019/12/25 20:55
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        char result = 0;
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i)) >1){
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }else {
                    map.remove(t.charAt(i));
                }
            }else {
                 result = t.charAt(i);
                 break;
            }
        }
        return result;
    }
}
