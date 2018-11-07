class Solution {
	//������������������ֵ��С�������List�����У�����List�����ҳ���kС��Ԫ��
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
       DFS(root);
       for(int i=0;i<list.size();i++){
           if(i == k-1)
             return list.get(i);
       }
        return -1;
        
    }
    private void DFS(TreeNode node){
        if(node == null)
            return;
        DFS(node.left);
        list.add(node.val);
        DFS(node.right);
    }
}