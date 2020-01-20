/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        help(root,result);
        return result;
    }
    
    private void help(Node root,List<Integer> result){
        if(root == null ) return;
        for(Node temp : root.children){
            help(temp,result);
        }
        result.add(root.val);
    }
}