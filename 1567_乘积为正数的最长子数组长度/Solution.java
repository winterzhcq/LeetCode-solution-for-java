
public class Solution {

    class DSU {

        int[] parent;

        public DSU(int N) {
            parent = new int[N];
            for (int i = 0; i < N; ++i) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        /**
         * 若合并前，x和y的parent相同，则表示形成环，返回true。
         *
         * @param x
         * @param y
         * @return
         */
        public boolean union(int x, int y) {
            int parentX = find(x);
            int parentY = find(y);
            if (parentX == parentY) {
                return true;
            }
            if (parentX < parentY) {
                parent[parentY] = parentX;
            } else {
                parent[parentX] = parentY;
            }
            return false;
        }
    }

    public boolean containsCycle(char[][] grid) {
        int h = grid.length;
        int w = grid[0].length;
        DSU dsu = new DSU(w * h);
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                char cur = grid[i][j];
                // 向右搜索
                if (j + 1 < w && cur == grid[i][j + 1]) {
                    if (dsu.union(i * w + j, i * w + j + 1)) {
                        return true;
                    }
                }
                // 向下搜索
                if (i + 1 < h && cur == grid[i + 1][j]) {
                    if (dsu.union(i * w + j, (i + 1) * w + j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
