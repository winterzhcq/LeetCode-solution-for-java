public class Solution {

      //从右到左开始，对每对数字执行乘法运算，并将它们加在一起。让我们画出这个过程吧！从以下草案中，我们可以立即得出结论！
/*          123     i
             45     j
           --------
             15
            10
           05
         -----------
            12
           08 pos[i+j][i+j+1]
          04
    ------------------
    */

    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
            return "0";
        int a = num1.length();
        int b = num2.length();
        int[] pos = new int[a+b];
        for (int i =a ; i>=0  ; i++) {
            for (int j = b; j >=0 ; j++) {
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int left = i+j;
                int right = left+1;
                int sum = mul+pos[right];
                pos[left] += sum/10;//加上近位
                pos[right] = sum%10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int p : pos) {
            if (!(p == 0 && stringBuilder.length()==0)) //结果最前面的'0'不要
                stringBuilder.append(p);
        }
        return stringBuilder.toString();
    }
}
