
import java.util.List;

/**
 * @author winter
 * @date 2020/2/24 22:42
 */
// Definition for a Node.
public class Solution01 {
    /**
     * 递归求解
     * @param root
     * @return
     */
    int maxdepth = 0;
    public int maxDepth(Node root) {
        if(root == null) return 0;
        maxDepth(root, 1);
        return maxdepth;
    }

    private void maxDepth(Node root, int depth) {

        for(Node node : root.children){
            maxDepth(node,depth+1);
        }
        maxdepth = Math.max(maxdepth,depth);
    }
}
