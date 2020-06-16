class Solution {
   public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1);
        }
        map.forEach((key, value) -> list.add(value));
        Collections.sort(list);
        int i;
        for (i = 0; i < list.size(); i++) {
            if (k - list.get(i) >= 0) k = k - list.get(i);
            else break;
        }
        return list.size() - i;
    }
}