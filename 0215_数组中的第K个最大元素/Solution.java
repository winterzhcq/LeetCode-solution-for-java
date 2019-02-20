
/**
 * @author winter
 * @date 2019/2/20 14:56
 */
public class Solution {
    /**
     * 采用快速排序的思想，快速找出第n大的元素
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        int left = 0,right = nums.length-1;
        k = nums.length -k;
        while (left < right){
            int j = pattern(nums,left,right);
            if ( j < k)
                left = j + 1;
            else if ( j > k)
                right = j - 1;
            else
                break;
        }
        return nums[k];
    }

    /**
     * 三路快排的核心
     * @param nums
     * @param l
     * @param r
     * @return
     */
    private int pattern(int[] nums, int l, int r) {
        int e = nums[l];
        int lt = l; //arr[l+1...lt] < v
        int gt = r+1; //arr[gt...r] > v
        int i = l+1; //arr[lt+1...i] == v
        while ( i < gt){
            if (nums[i] < e){
                swap(nums,i,lt+1);
                i++;
                lt++;
            }
            else if ( nums[i] > e){
                swap(nums,i,gt-1);
                gt--;
            }
            else {
                i++;
            }
        }
        swap(nums,l,lt);
        return lt;
    }
    //交换两个元素的值
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        Solution solution = new Solution();

        System.out.println(solution.findKthLargest(a,4));
    }
}
