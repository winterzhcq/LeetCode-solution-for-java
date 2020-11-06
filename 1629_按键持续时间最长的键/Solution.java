
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char maxChar = keysPressed.charAt(0);
        for (int i= 1;i<releaseTimes.length;i++){
            int temp = releaseTimes[i]-releaseTimes[i-1];
            if ( temp > max){
                max = releaseTimes[i]-releaseTimes[i-1];
                maxChar = keysPressed.charAt(i);
            }
            if (temp==max){
                if (keysPressed.charAt(i)>maxChar){
                    maxChar=keysPressed.charAt(i);
                }
            }
        }
        return maxChar;
    }


}
