
/**
 * Binary Lifting 的本质其实是 dp。dp[node][j] 存储的是 node 节点距离为 2^j 的祖先是谁。
 *
 * 根据定义，dp[node][0] 就是 parent[node]，即 node 的距离为 1 的祖先是 parent[node]。
 *
 * 状态转移是： dp[node][j] = dp[dp[node][j - 1]][j - 1]。
 *
 * 意思是：要想找到 node 的距离 2^j 的祖先，先找到 node 的距离 2^(j - 1) 的祖先，
 *
 * 然后，再找这个祖先的距离 2^(j - 1) 的祖先。两步得到 node 的距离为 2^j 的祖先。
 *
 */
public class TreeAncestor {

    int[][] dp;

    public TreeAncestor(int n, int[] parent) {
        dp = new int[n][(int) (Math.log(n) / Math.log(2)) + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = parent[i];
        }

        for (int j = 1; (1 << j) < n; j++) {
            for (int i = 0; i < n; i++) {
                dp[i][j] = dp[i][j - 1] != -1 ? dp[dp[i][j - 1]][j - 1] : -1;
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        if (k == 0 || node == -1) return node;

        int p = (int) (Math.log(k) / Math.log(2));

        return getKthAncestor(dp[node][p], k - (1 << p));
    }

    public static void main(String[] args) {
        TreeAncestor treeAncestor = new TreeAncestor(7, new int[]{-1, 0, 0, 1, 1, 2, 2});
        treeAncestor.getKthAncestor(3, 1);  // 返回 1 ，它是 3 的父节点
        treeAncestor.getKthAncestor(5, 2);  // 返回 0 ，它是 5 的祖父节点
        treeAncestor.getKthAncestor(6, 3);  // 返回 -1 因为不存在满足要求的祖先节点

    }

}
