package com.study.leetcode.不同路径;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: peterche
 * @Description:
 * @Date: 2025/9/20 22:36
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int i = main.uniquePaths(51, 9);
        System.out.println(i);
    }

    Map<String, Integer> map = new HashMap<>();

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        String key = m + ":" + n;
        Integer result = map.get(key);
        if (result != null) {
            return result;
        }
        result = uniquePaths(m - 1, n) + uniquePaths(m, n -1);
        map.put(key, result);
        return result;
    }
}
