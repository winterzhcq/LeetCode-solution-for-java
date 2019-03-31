
import java.util.ArrayList;
import java.util.List;

/**
 * @author winter
 * @date 2019/3/30 15:00
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val = x;};
}

/**
 * 递归解决问题步骤
 *1.求解最基本的问题，也就是递归结束的条件
 *2.将原问题转化成更小的子问题，不要在意具体的执行细节，看整体
 *3.对更小的子问题求解，然后组合成原问题的解
 */
public class Solution {
    /*
    * 分析该问题，采用递归，我们可以将求一个1...n节点所组成的二叉树，根节点可以是任意的一个数
    * 那么随机选一个x作为根节点，那么x左边的数就是x节点的左子树，x右边的数就会根节点的右子树；
    * 那么就把原问题转换成更小的之问题，最后因为左右字数有很多，我们需要对不同的情况进行合并
    * 也就是组合成原问题的解。
    *
    * */
    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<TreeNode>();
        return genTrees(1,n);
    }

    public List<TreeNode> genTrees (int start, int end)
    {

        List<TreeNode> list = new ArrayList<>();
        //求解最基本的问题
        if(start>end)
        {
            list.add(null);
            return list;
        }
        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }

        List<TreeNode> left,right;
        for(int i=start;i<=end;i++)
        {
            //将原问题转换成更小的子问题
            left = genTrees(start, i-1);
            right = genTrees(i+1,end);
            //对更小的之问题组合成原问题的解
            for(TreeNode lnode: left)
            {
                for(TreeNode rnode: right)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }

        }
        return list;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateTrees(3);
    }
}
