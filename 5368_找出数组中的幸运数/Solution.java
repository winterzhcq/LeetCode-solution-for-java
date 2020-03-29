class Solution {
  public int findLucky(int[] arr) {
        int lucknum = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i < arr.length;i++){
            if (map.get(arr[i]) == null){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(Map.Entry<Integer, Integer> a : map.entrySet()){
            if (a.getKey() == a.getValue() && a.getKey() > lucknum) lucknum = a.getKey();
        }
        return lucknum;
    }
}