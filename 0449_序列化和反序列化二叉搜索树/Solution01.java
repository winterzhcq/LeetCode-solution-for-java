
/**
 * @author winter
 * @date 2019/11/27 21:27
 */
public class Solution01 {
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        serialize(root,str);
        return str.toString();
    }

    private void serialize(TreeNode root, StringBuilder str) {
        if (root == null) return;
        str.append(root.val).append(" ");
        serialize(root.left,str);
        serialize(root.right,str);
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;
         String[] list = data.split(" ");
         TreeNode dummy = new TreeNode(0);
        deserializedfs(list, 0, dummy, true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return dummy.left;
    }

    private int deserializedfs(String[] list, int pos, TreeNode dummy, boolean isleft, int lower, int upper) {

        if (pos >= list.length) return pos;
        int val = Integer.parseInt(list[pos]);
        if (val < lower || val > upper) return pos-1;
        TreeNode cur = new TreeNode(val);

        if(isleft) dummy.left = cur;
        else       dummy.right = cur;

        pos = deserializedfs(list, ++pos, cur, true, lower, val);
        pos = deserializedfs(list, ++pos, cur, false, val, upper);
        return pos;

    }
}
