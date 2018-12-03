public class Solution {

      //���ҵ���ʼ����ÿ������ִ�г˷����㣬�������Ǽ���һ�������ǻ���������̰ɣ������²ݰ��У����ǿ��������ó����ۣ�
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
                pos[left] += sum/10;//���Ͻ�λ
                pos[right] = sum%10;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int p : pos) {
            if (!(p == 0 && stringBuilder.length()==0)) //�����ǰ���'0'��Ҫ
                stringBuilder.append(p);
        }
        return stringBuilder.toString();
    }
}
