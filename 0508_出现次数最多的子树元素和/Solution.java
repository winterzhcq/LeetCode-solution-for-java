**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxFrequency = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
        return map.entrySet().stream().
        filter(entry -> entry.getValue().equals( maxFrequency)).
        mapToInt(Map.Entry::getKey).toArray();
    }
    private int helper(TreeNode root){
         if(root == null) return 0;
         int sum = helper(root.left) + helper(root.right) + root.val;
         int frequency = map.getOrDefault(sum, 0) + 1;
         maxFrequency = frequency > maxFrequency ? frequency : maxFrequency;
         map.put(sum, frequency);
         return sum;
    }
}