class Solution {
 public int getWinner(int[] arr, int k) {
        if (k >= arr.length) return  Arrays.stream(arr).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        int count =0;
        for (int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        while (true){
            if (count ==k) return list.get(0);
            if (list.get(0) < list.get(1)){
                int temp = list.get(0);
                list.remove(0);
                list.add(temp);
                count = 1;
            }else if (list.get(0) > list.get(1)){
                int temp = list.get(1);
                list.remove(1);
                list.add(temp);
                count++;
            }
        }
    }
}