class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i = 0;i < nums1.length;i++){
            result[i] = map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}