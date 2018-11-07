class Solution {
	//遍历二分搜索数，将值从小到大存在List集合中，遍历List集合找出第k小的元素
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