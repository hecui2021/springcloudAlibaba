package com.study.algorithm.动态规划.背包问题;

/**
 * @author peterche
 * @description: 0-1 背包问题
 * 问题描述
 * 给定一组物品，每个物品有重量和价值。在不超过背包容量的情况下，选择物品使得总价值最大。
 * @date 2025-03-27
 */
public class Knapsack {
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1]; // 定义状态数组

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]); // 状态转移方程
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacity]; // 返回结果
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        System.out.println("Maximum value: " + knapsack(weights, values, capacity));
    }
}
