
import java.util.HashMap;
import java.util.Map;

/**
 * @author winter
 * @date 2019/9/28 20:33
 */
public class Solution {
    Map<Character,Integer> map = new HashMap<>();
    public int romanToInt(String s) {
        int sum = 0;
        int right = 0;
         Map<Character,Integer> maps = initmap(map);
        for (int i = s.length() - 1; i >= 0 ; i--) {
            int value = maps.get(s.charAt(i));
            if (maps.get(s.charAt(i)) >= right)
                sum +=value ;
            else sum -= value;
            right = value;
        }
        return sum;
    }
    public Map<Character,Integer> initmap(Map<Character,Integer> map){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }
}
