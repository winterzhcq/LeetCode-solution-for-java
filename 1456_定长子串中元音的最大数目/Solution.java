class Solution {
   public int maxVowels(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        int result =0 ;
        int maxNumber = 0;
        int i = 0;
        int j = 0;
        Map<Character,Character> map = new HashMap<>();
        map.put('a','a');
        map.put('e','e');
        map.put('i','i');
        map.put('o','o');
        map.put('u','u');
        int length = s.length();
        if (length < k) return 0;
        while (i < length){
            if (map.get(s.charAt(i)) != null) maxNumber++;

            if (j==k-1){
                result = Math.max(result,maxNumber);
                if (map.get(s.charAt(i-k+1)) != null) maxNumber--;
                j--;
            }
            i++;
            j++;
        }
        return result;
    }
}