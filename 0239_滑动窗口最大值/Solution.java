
import java.util.PriorityQueue;

/**
 * @author winter
 * @date 2019/10/27 12:26
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums ==null || nums.length == 0) return nums;
        int[] res = new int[nums.length - k+1];
        int temp=0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        for(int i=0; i<nums.length;i++){
            if(maxHeap.size() < k){
                maxHeap.add(nums[i]);
                if(i >= k-1){
                    res[temp++]=maxHeap.peek();
                    maxHeap.remove(nums[i-k+1]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        final int[] ints = solution.maxSlidingWindow(new int[]{-7, -8, 7, 5, -8,7, 1, 6, 0}, 4);
        for (int i = 0; i < ints.length ; i++) {
            System.out.println(ints[i]);
        }
    }
}
