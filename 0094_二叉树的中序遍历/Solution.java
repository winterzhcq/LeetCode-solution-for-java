class Solution {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        while (true){
            if (root != null){
                stack.push(root);
                root = root.left;
            }else {
                if (stack.isEmpty())
                    return list;
                root = stack.pop();
                list.add(root.val);
                root = root.right;

            }
        }
    }
}