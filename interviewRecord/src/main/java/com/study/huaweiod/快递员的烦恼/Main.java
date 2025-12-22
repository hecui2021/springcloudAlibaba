import java.util.*;

public class Main {
    static final int INF = Integer.MAX_VALUE / 2; // 防止整数溢出

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 客户ID到索引的映射，投递站索引为0
        Map<Integer, Integer> idToIndex = new HashMap<>();
        idToIndex.put(0, 0); // 投递站映射为索引0
        int currentIndex = 1;

        // 初始化距离矩阵，初始值为INF
        int[][] dist = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0; // 自己到自己的距离为0
        }

        // 读取投递站到客户的距离
        for (int i = 0; i < n; i++) {
            int customerId = scanner.nextInt();
            int distance = scanner.nextInt();
            if (!idToIndex.containsKey(customerId)) {
                idToIndex.put(customerId, currentIndex++);
            }
            int idx = idToIndex.get(customerId);
            dist[0][idx] = distance;
            dist[idx][0] = distance;
        }

        // 读取客户与客户之间的距离
        for (int i = 0; i < m; i++) {
            int id1 = scanner.nextInt();
            int id2 = scanner.nextInt();
            int distance = scanner.nextInt();
            int idx1 = idToIndex.get(id1);
            int idx2 = idToIndex.get(id2);
            dist[idx1][idx2] = distance;
            dist[idx2][idx1] = distance;
        }

        // 1. 使用Floyd-Warshall算法计算任意两点间最短距离
        for (int k = 0; k <= n; k++) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // 2. 状态压缩动态规划解决TSP
        // 状态总数：2^(n+1) 个，因为包括投递站有 n+1 个节点
        int stateCount = 1 << (n + 1);
        int[][] dp = new int[stateCount][n + 1];
        // 初始化dp数组为无穷大
        for (int i = 0; i < stateCount; i++) {
            Arrays.fill(dp[i], INF);
        }

        // 初始状态：只访问了投递站（节点0），当前在投递站，距离为0
        dp[1][0] = 0;

        // 遍历所有状态
        for (int state = 1; state < stateCount; state++) {
            for (int i = 0; i <= n; i++) {
                // 如果当前状态state不包括节点i，则跳过
                if ((state & (1 << i)) == 0) continue;
                // 如果当前状态值不可达，也跳过
                if (dp[state][i] == INF) continue;

                // 尝试从节点i转移到所有未访问的节点k
                for (int k = 0; k <= n; k++) {
                    // 如果节点k已经被访问过，则跳过
                    if ((state & (1 << k)) != 0) continue;
                    // 如果i到k不可达，则跳过
                    if (dist[i][k] == INF) continue;

                    int newState = state | (1 << k);
                    dp[newState][k] = Math.min(dp[newState][k], dp[state][i] + dist[i][k]);
                }
            }
        }

        // 3. 寻找答案：最终状态是所有节点都被访问（state的全1状态），并回到投递站（节点0）
        int finalState = stateCount - 1; // 全1状态
        int ans = INF;
        for (int i = 0; i <= n; i++) {
            if (dp[finalState][i] != INF && dist[i][0] != INF) {
                ans = Math.min(ans, dp[finalState][i] + dist[i][0]);
            }
        }

        // 输出结果，如果无法找到路径则输出-1
        System.out.println(ans == INF ? -1 : ans);
    }
}