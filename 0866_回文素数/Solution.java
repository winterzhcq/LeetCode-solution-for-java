
/**
 * @author winter
 * @date 2019/9/21 15:58
 */
public class Solution {
    public int primePalindrome(int N) {
        if (N <= 1)
            return 2;
        int temp = N+1;
        while (true){
            if (isPalindrome(temp)&&isPrimeNumber(temp))
                return temp;
            temp++;
        }
    }
    private boolean isPrimeNumber(int n){
        if (n <= 3) {
            return n > 1;
        }
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private boolean isPalindrome(int x){
        if(x<0 || (x%10 == 0 && x !=0))
            return false;
        int reverteNumber = 0;
        while (x > reverteNumber){
            reverteNumber = reverteNumber*10 + x%10;
            x = x/10;
        }
        return x == reverteNumber || x == reverteNumber/10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPrimeNumber(9));
        System.out.println(solution.primePalindrome(8));
    }
}
