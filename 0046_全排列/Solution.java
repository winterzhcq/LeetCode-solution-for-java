public class Solution {

    //采用递归解决
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
         permute(lists,nums,0);
         return lists;
    }

    private void permute(List<List<Integer>> lists,int[] nums,int index ){
        if (index == nums.length -1 ) {
            List<Integer> list = new ArrayList<>();
            for(int num : nums)
                list.add(num);
            System.out.println(list);
            lists.add(list);
        }else {
            for (int i = index; i < nums.length; i++) {
                swap(nums,i,index);
                permute(lists,nums, index + 1);
                swap(nums,i,index); //保证第二次交换是最初的顺序
            }
        }
    }
    public int[] swap(int[] nums, int first, int second) {
        int c = nums[first];
        nums[first] = nums[second];
        nums[second] = c;
        return nums;
    }
}
