class Solution {
    public int reverse(int x) {
        int result=0;
        int p = 0;
        while(x!=0){
            p = x%10;
            x = x/10;
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && p>7))
                return 0;
            if(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE/10 && p<-8))
                 return 0;
            result = result*10+p;
        }
        return result;
        
    }
}