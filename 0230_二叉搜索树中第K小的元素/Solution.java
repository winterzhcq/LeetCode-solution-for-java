class Solution {
	//ʹ�õݹ���������ݴ���С�Ŀ�ʼ��ÿ����һ���ڵ��1
    public int index;
    public int target;
    public int result;
    public int kthSmallest(TreeNode root, int k) {
        index = 0;
        target = k;
        return findKMinIndex(root);
    }
    private int findKMinIndex(TreeNode node){
        if(node == null)
            return -1;
        findKMinIndex(node.left);
        index++;
        if(index == target)
            result = node.val;
        findKMinIndex(node.right);
        return result;
    }
}