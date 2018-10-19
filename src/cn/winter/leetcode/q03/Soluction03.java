package cn.winter.leetcode.q03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author winter
 * @date 2018/8/16 17:35
 */
public class Soluction03 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length(),ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0,j=0; j <length ; j++) {
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j-i-1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
