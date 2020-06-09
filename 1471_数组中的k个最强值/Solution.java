class Solution {
     public int[] getStrongest(int[] arr, int k) {
        int[] temp = arr;
        Arrays.sort(temp);
        int midnum = temp[(arr.length - 1) / 2];
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list,
                (a, b) -> {
                    if (Math.abs(a - midnum) > Math.abs(b - midnum)) return -1;
                    if (Math.abs(a - midnum) == Math.abs(b - midnum) && a > b) return -1;
                    return 1;
                });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}