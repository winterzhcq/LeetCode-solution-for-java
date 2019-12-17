class Solution {
  public int subtractProductAndSum(int n) {
        int muti = 1;
        int sum = 0;
        while(n!=0){
        	muti *=n%10;
        	sum +=n%10;
        	n/=10;
        } 
        return muti-sum;
    }
}