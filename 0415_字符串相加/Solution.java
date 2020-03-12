class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder("");
        int l1 = num1.length() - 1 ; 
        int l2 = num2.length() - 1 ;
        int cur = 0;
        while(l1 >= 0 || l2 >= 0 ){
            int n1 = l1 >= 0 ? num1.charAt(l1) - '0' : 0;
            int n2 = l2 >= 0 ? num2.charAt(l2) - '0' : 0;
            int temp = n1+n2+cur;
            str.append(temp%10);
            cur = temp/10;
            l1--;
            l2--;
        }
        if(cur == 1) str.append(1);
        return str.reverse().toString();
    }
}