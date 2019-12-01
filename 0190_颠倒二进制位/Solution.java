public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int resver = 0;
        for(int i = 0;i<32 ;i++){
            resver +=((1&(n>>i))<<(31-i));
        }
        return resver;
    }
}