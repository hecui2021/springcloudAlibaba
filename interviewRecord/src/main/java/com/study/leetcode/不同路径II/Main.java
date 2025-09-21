package com.study.leetcode.不同路径II;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/21 08:30
 */
public class Main {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        Map<String, Integer> map = new HashMap();
        return dfs(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1, map);
    }

    public int dfs(int[][] obstacleGrid, int m, int n, Map<String, Integer> map) {
        if (m < 0 || n < 0) {
            return 0;
        }

        if (obstacleGrid[m][n] == 1) {
            return 0;
        }

        if (m == 0 && n == 0 && obstacleGrid[0][0] == 0) {
            return 1;
        }

        String key = m + ":" + n;
        Integer value = map.get(key);
        if (value != null) {
            return value;
        }
        value = dfs(obstacleGrid, m - 1, n, map) + dfs(obstacleGrid, m, n - 1, map);
        map.put(key, value);
        return value;
    }
}
