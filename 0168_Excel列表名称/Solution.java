class Solution {
    //思路：1~26分别对应A~Z,相当于10进制数转26进制数，参考10进制数转二进制数采用除二取余法，
    //10进制数转26进制数可除26取余，再将所得余数换成对应的A~Z的字母即可。
    public String convertToTitle(int n) {
        String temp = "";
        while(n>0){
            char s = (char)((n-1)%26+'A');
            temp = s+temp;
            n  = (n-1)/26;
        }
        return temp;
    }
}