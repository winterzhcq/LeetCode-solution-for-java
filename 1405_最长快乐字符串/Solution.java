
import java.util.Arrays;

/**
 * 贪心算法求解，先把最长的字符串排列，但是保证的条件是不能联系超过两位
 * 每轮放置字符时优先先放剩余次数最多的, 如果上次放的2个字符和剩余个数最多的字符相同，则放置次多的字符
 * （经过排序，不可能用到第三个字符）
 * @author winter
 * @date 2020/4/7 22:39
 */
public class Solution {
    public String longestDiverseString(int a, int b, int c) {
        MyChar[] myChars = new MyChar[]{
                new MyChar('a',a),
                new MyChar('b',b),
                new MyChar('c',c)
        };
        StringBuilder str = new StringBuilder();
        while (true){
            Arrays.sort(myChars);
            if (str.length() >=2 && myChars[2].ch == str.charAt(str.length()-1) && myChars[2].ch == str.charAt(str.length()-2)){
                if (myChars[1].count-- >0) str.append(myChars[1].ch);
                else break;
            }else {
                if (myChars[2].count-- >0) str.append(myChars[2].ch);
                else break;
            }
        }
        return str.toString();
    }
    class MyChar implements Comparable{
        char ch;
        int count;
        public MyChar(char ch,int count){
            this.ch = ch;
            this.count = count;
        }
        @Override
        public int compareTo(Object o) {
            MyChar myChar = (MyChar) o;
            return this.count - myChar.count;
        }
    }
}
