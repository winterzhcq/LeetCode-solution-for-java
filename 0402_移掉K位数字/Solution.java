package cn.winter.leetcode.q402;

import java.util.Stack;

/**
 * @author winter
 * @date 2018/11/13 13:05
 */
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        int digits = len - k;
        char[] stack = new char[len];//使用一个数组栈来存储
        int top = 0;//记录栈顶元素位置
        for (int i=0;i<len;i++){
            char c = num.charAt(i);
            while(top>0&&c<stack[top-1]&&k>0){
                //最开始以为用个if判断，但是只要删除了一次，当前元素还是可能比删除的前一个小，所以循环删除，直到当前元素大于前一个元素
                top -= 1;
                k -=1;
            }
            stack[top++] = c;
        }
        int index = 0;
        //排除数字最开始为0
       while (index<digits && stack[index] == '0' ) index++;
       //当没有删除和有删除元素时我们在这里一步解决
       return index == digits ? "0" : new String(stack,index,digits-index);
    }
}